/*
 * SRM526-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class DucksAlignment {

	public int minimumTime(String[] grid) {
		int h = grid.length;
		int w = grid[0].length();

		int[] cols = new int[h];
		int[] rows = new int[w];

		for (int i = 0; i < h; ++i)
			cols[i] = grid[i].indexOf('o');

		for (int i = 0; i < w; ++i)
			rows[i] = findRow(grid, i);

		int c = 0;

		for (int r : rows)
			if (r >= 0)
				++c;

		return min(align(cols, w, h) + group(cols, h, c), align(rows, h, w) + group(rows, w, c));
	}

	private int group(int[] cols, int h, int c) {
		int mcg = Integer.MAX_VALUE;

		for (int i = 0; i <= h - c; ++i) {
			int cg = 0, ci = 0;

			for (int j = 0; j < h; ++j)
				if (cols[j] >= 0) {
					cg += abs(j - i - ci);
					ci++;
				}

			mcg = min(mcg, cg);
		}

		return mcg;
	}

	private int align(int[] cols, int w, int h) {
		int mcp = Integer.MAX_VALUE;

		for (int i = 0; i < w; ++i) {
			int cp = 0;

			for (int j = 0; j < h; ++j)
				if (cols[j] >= 0)
					cp += abs(cols[j] - i);

			mcp = min(mcp, cp);
		}

		return mcp;
	}

	private int findRow(String[] grid, int c) {
		for (int r = 0; r < grid.length; ++r)
			if (grid[r].charAt(c) == 'o')
				return r;

		return -1;
	}

}
