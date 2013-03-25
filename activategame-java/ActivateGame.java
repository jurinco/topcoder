/*
 * SRM470-D2-1000
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class ActivateGame {

	int[] DI = { 0, 0, -1, 1 };
	int[] DJ = { -1, 1, 0, 0 };

	public int findMaxScore(String[] grid) {
		int[][] numbers = new int[grid.length][grid[0].length()];
		boolean[][] activated = new boolean[grid.length][grid[0].length()];

		int w = grid[0].length();
		int h = grid.length;

		for (int y = 0; y < h; ++y) {
			for (int x = 0; x < w; ++x)
				numbers[y][x] = num(grid[y].charAt(x));

			Arrays.fill(activated[y], false);
		}

		activated[0][0] = true;
		int score = 0;

		for (int activatedCount = 1; activatedCount < w * h; activatedCount++) {
			int si = -1, sj = -1, max = -1;

			for (int ai = 0; ai < h; ++ai)
				for (int aj = 0; aj < w; ++aj)
					if (activated[ai][aj])
						for (int i = 0; i < DI.length; ++i) {
							int ni = ai + DI[i];
							int nj = aj + DJ[i];

							if (ni >= 0 && ni < h && nj >= 0 && nj < w && !activated[ni][nj]) {
								int d = abs(numbers[ai][aj] - numbers[ni][nj]);
								if (d > max) {
									max = d;
									si = ni;
									sj = nj;
								}
							}
						}

			score += max;
			activated[si][sj] = true;
		}

		return score;
	}

	private int num(char c) {
		if (c >= '0' && c <= '9')
			return c - '0';
		if (c >= 'a' && c <= 'z')
			return c - 'a' + 10;
		if (c >= 'A' && c <= 'Z')
			return c - 'A' + 36;

		throw new IllegalArgumentException();
	}

}
