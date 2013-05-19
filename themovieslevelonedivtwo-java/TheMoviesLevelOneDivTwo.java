/*
 * SRM469-D2-250
 * SOLVED
 */

public class TheMoviesLevelOneDivTwo {

	public int find(int n, int m, int[] row, int[] seat) {
		boolean[][] all = new boolean[n][m];

		for (int i = 0; i < row.length; ++i)
			all[row[i] - 1][seat[i] - 1] = true;

		int res = 0;
		for (boolean[] occupied : all)
			for (int i = 1; i < occupied.length; ++i)
				if (!occupied[i] && !occupied[i - 1])
					res++;

		return res;
	}

}
