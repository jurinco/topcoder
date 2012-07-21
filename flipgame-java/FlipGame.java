/*
 * SRM544-D1-500
 * SOLVED
 */

import static java.lang.Math.*;

public class FlipGame {

	public int minOperations(String[] board) {
		boolean[][] matrix = new boolean[board.length][];

		for (int i = 0; i < board.length; ++i)
			matrix[i] = stringToBoolArray(board[i]);

		int counter = 0;

		while (!end(matrix)) {
			step(matrix);
			counter++;
		}

		return counter;
	}

	private void step(boolean[][] matrix) {
		int ofs = 0;

		for (int i = 0; i < matrix.length; ++i) {
			boolean[] row = matrix[i];

			ofs = max(ofs, last(row));

			for (int j = 0; j < ofs; ++j)
				row[j] = !row[j];
		}
	}

	private int last(boolean[] row) {
		for (int i = row.length; i > 0; --i)
			if (row[i - 1])
				return i;

		return 0;
	}

	private boolean end(boolean[][] matrix) {
		for (boolean[] row : matrix)
			for (boolean b : row)
				if (b)
					return false;

		return true;
	}

	private boolean[] stringToBoolArray(String row) {
		boolean[] values = new boolean[row.length()];

		for (int i = 0; i < row.length(); ++i)
			values[i] = row.charAt(i) == '1';

		return values;
	}

}
