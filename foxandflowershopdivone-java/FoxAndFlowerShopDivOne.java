/*
 * SRM522-D1-500
 * UNSOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class FoxAndFlowerShopDivOne {

	public int theMaxFlowers(String[] flowers, int maxDiff) {
		int w = flowers[0].length();
		int h = flowers.length;

		int[][] lils = counterSums(flowers, 'L');
		int[][] pets = counterSums(flowers, 'P');

		int m = -1;
		for (int y1 = 0; y1 < h; ++y1) {
			for (int y2 = y1; y2 < h; ++y2) {
				for (int x1 = 0; x1 < w; ++x1) {
					for (int x2 = x1; x2 < w; ++x2) {
						int l = count(lils, x1, x2, y1, y2);
						int p = count(pets, x1, x2, y1, y2);

						for (int yy1 = 0; yy1 < h; ++yy1) {
							for (int yy2 = yy1; yy2 < h; ++yy2) {
								for (int xx1 = 0; xx1 < w; ++xx1) {
									for (int xx2 = xx1; xx2 < w; ++xx2)
										if (xx1 > x2 || xx2 < x1 || yy1 > y2 || yy2 < y1) {
											int ll = count(lils, xx1, xx2, yy1, yy2);
											int pp = count(pets, xx1, xx2, yy1, yy2);

											if (abs(l + ll - p - pp) <= maxDiff)
												m = max(m, l + ll + p + pp);
										}
								}
							}
						}

					}
				}
			}
		}

		return m;
	}

	int[][] counterSums(String[] board, char c) {
		int w = board[0].length();
		int h = board.length;

		int[][] sums = new int[h][w];

		int rowcounter = 0;
		for (int i = 0; i < w; ++i) {
			if (board[0].charAt(i) == c)
				rowcounter++;

			sums[0][i] = rowcounter;
		}

		for (int i = 1; i < h; ++i) {
			rowcounter = 0;

			for (int j = 0; j < w; ++j) {
				if (board[i].charAt(j) == c)
					rowcounter++;

				sums[i][j] = sums[i - 1][j] + rowcounter;
			}
		}

		return sums;
	}

	int count(int[][] flows, int x1, int x2, int y1, int y2) {
		int count = flows[y2][x2];

		if (x1 > 0)
			count -= flows[y2][x1 - 1];

		if (y1 > 0)
			count -= flows[y1 - 1][x2];

		if (y1 > 0 && x1 > 0)
			count += flows[y1 - 1][x1 - 1];

		return count;
	}

}
