/*
 * SRM160-D2-1000
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class Quilting {

	static int[] DX = { 0, -1, 0, 1 };
	static int[] DY = { -1, 0, 1, 0 };

	public String lastPatch(int length, int width, String[] colorList) {
		int[][] m = new int[width][length];
		int[] used = new int[colorList.length];

		Arrays.fill(used, 0);

		for (int i = 0; i < m.length; ++i)
			Arrays.fill(m[i], -1);

		int sx = width / 2;
		int sy = length / 2;
		int d = 3;
		int lc = -1;

		int[] neig = new int[colorList.length];

		for (int i = 0; i < length * width; ++i) {
			lc = selectColor(m, sx, sy, colorList, used, neig);

			m[sx][sy] = lc;
			used[lc]++;

			if (i != length * width - 1) {
				int nd = (d + 1) % DX.length;
				if (m[sx + DX[nd]][sy + DY[nd]] < 0)
					d = nd;

				sx += DX[d];
				sy += DY[d];
			}
		}

		return colorList[lc];
	}

	private int selectColor(int[][] m, int sx, int sy, String[] colorList, int[] used, int[] neig) {
		Arrays.fill(neig, 0);

		for (int dx = -1; dx <= 1; ++dx)
			for (int dy = -1; dy <= 1; ++dy)
				if ((dx != 0 || dy != 0) && sx + dx >= 0 && sx + dx < m.length && sy + dy >= 0 && sy + dy < m[0].length && m[sx + dx][sy + dy] >= 0)
					neig[m[sx + dx][sy + dy]]++;

		int mn = Integer.MAX_VALUE;
		for (int n : neig)
			mn = min(mn, n);

		int mu = Integer.MAX_VALUE;
		for (int c = 0; c < colorList.length; ++c)
			if (neig[c] == mn)
				mu = min(mu, used[c]);

		for (int c = 0; c < colorList.length; ++c)
			if (neig[c] == mn && used[c] == mu)
				return c;

		throw new RuntimeException();
	}

}
