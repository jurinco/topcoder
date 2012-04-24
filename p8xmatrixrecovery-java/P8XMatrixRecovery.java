/*
 * SRM527-D1-450
 * UNSOLVED
 */

import java.util.*;

public class P8XMatrixRecovery {

	private static final Comparator<String> columnComparator = new Comparator<String>() {

		public int compare(String c1, String c2) {
			for (int i = 0; i < c1.length(); ++i) {
				if (c1.charAt(i) == '0' && c2.charAt(i) != '0')
					return -1;
				else if (c1.charAt(i) == '1' && c2.charAt(i) != '1')
					return 1;
				else if (c2.charAt(i) == '0' && c1.charAt(i) != '0')
					return 1;
				else if (c2.charAt(i) == '1' && c1.charAt(i) != '1')
					return -1;
			}
			return 0;
		}

	};

	public String[] solve(String[] rows, String[] columns) {
		Arrays.sort(columns, columnComparator);

		BitSet[] colCands = new BitSet[columns.length];

		for (int i = 0; i < colCands.length; i++) {
			colCands[i] = new BitSet(columns.length);
			colCands[i].set(0, columns.length);
		}

		for (int i = 0; i < rows.length; ++i)
			updateCands(rows[i], columns, i, colCands);

		for (int i = 0; i < rows.length; ++i)
			rows[i] = updateRow(rows[i], columns, i, colCands);

		return makeMatrix(solveFrom(rows, columns, colCands, 0, 0));
	}

	private String[] makeMatrix(char[][] rows) {
		String[] matrix = new String[rows.length];

		for (int i = 0; i < matrix.length; i++)
			matrix[i] = new String(rows[i]);

		return matrix;
	}

	private char[][] solveFrom(String[] rows, String[] columns, BitSet[] colCands, int y, int x) {

		if (y >= rows.length) {
			if (!colSetExists(colCands, 0, new BitSet(columns.length)))
				return null;

			return new char[rows.length][columns.length];
		}

		if (x >= columns.length)
			return solveFrom(rows, columns, colCands, y + 1, 0);

		char[][] res = null;

		if (rows[y].charAt(x) == '?') {
			BitSet c = colCands[x];
			BitSet c0 = filterColCands(columns, c, y, '0');

			if (!c0.isEmpty()) {
				colCands[x] = c0;
				res = solveFrom(rows, columns, colCands, y, x + 1);
				colCands[x] = c;

				if (res != null)
					res[y][x] = '0';
			}

			if (res == null) {
				BitSet c1 = filterColCands(columns, c, y, '1');

				if (!c1.isEmpty()) {
					colCands[x] = c1;
					res = solveFrom(rows, columns, colCands, y, x + 1);
					colCands[x] = c;

					if (res != null)
						res[y][x] = '1';
				}
			}
		} else {
			res = solveFrom(rows, columns, colCands, y, x + 1);

			if (res != null)
				res[y][x] = rows[y].charAt(x);
		}

		return res;
	}

	private boolean colSetExists(BitSet[] colCands, int ofs, BitSet used) {
		if (ofs >= colCands.length)
			return true;

		for (int i = 0; i < colCands[ofs].length(); ++i)
			if (colCands[ofs].get(i) && !used.get(i)) {
				used.set(i);

				try {
					if (colSetExists(colCands, ofs + 1, used))
						return true;
				} finally {
					used.clear(i);
				}
			}

		return false;
	}

	private BitSet filterColCands(String[] columns, BitSet cand, int y, char v) {
		BitSet res = new BitSet();

		for (int i = 0; i < columns.length; ++i)
			if (cand.get(i) && (columns[i].charAt(y) == '?' || columns[i].charAt(y) == v))
				res.set(i);

		return res;
	}

	private void updateCands(String row, String[] columns, int rowNum, BitSet[] colCands) {
		for (int i = 0; i < columns.length; i++)
			if (row.charAt(i) != '?')
				for (int j = 0; j < columns.length; j++)
					if (columns[j].charAt(rowNum) != '?')
						if (columns[j].charAt(rowNum) != row.charAt(i))
							colCands[i].clear(j);
	}

	private String updateRow(String row, String[] columns, int i, BitSet[] colCands) {
		char[] res = row.toCharArray();

		for (int x = 0; x < res.length; ++x) {
			if (allColCands(columns, colCands, i, x, '0'))
				res[x] = '0';

			if (allColCands(columns, colCands, i, x, '1'))
				res[x] = '1';
		}

		return new String(res);
	}

	private boolean allColCands(String[] columns, BitSet[] colCands, int y, int x, char c) {
		for (int i = 0; i < columns.length; ++i)
			if (colCands[x].get(i) && columns[i].charAt(y) != c)
				return false;

		return true;
	}

}
