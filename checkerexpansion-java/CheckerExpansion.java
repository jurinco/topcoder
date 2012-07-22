/*
 * SRM550-D1-500
 * SOLVED
 * UGLY
 */

import java.util.*;

public class CheckerExpansion {

	public String[] resultAfter(long t, long x0, long y0, int w, int h) {
		char[][] rm = new char[h][w];

		for (int i = 0; i < h; ++i)
			Arrays.fill(rm[i], '.');

		long minx = x0;
		long maxx = x0 + w;
		long miny = y0;
		long maxy = y0 + h;

		ArrayList<Integer> pows = buidPows(t);

		draw(0, 0, 0, pows, rm, minx, miny, maxx, maxy);

		return convert(rm);
	}

	private void draw(long x, long y, int ind, ArrayList<Integer> pows, char[][] rm, long minx, long miny, long maxx, long maxy) {
		if (pows.size() <= ind)
			return;

		if (x >= maxx || y >= maxy)
			return;

		int size = pows.get(ind);

		draw(x, y, size, rm, minx, miny, maxx, maxy);

		draw(x + (2L << size), y, ind + 1, pows, rm, minx, miny, maxx, maxy);
		draw(x + (1L << size), y + (1L << size), ind + 1, pows, rm, minx, miny, maxx, maxy);
	}

	private void draw(long x, long y, int size, char[][] rm, long minx, long miny, long maxx, long maxy) {
		if (y >= maxy || x >= maxx)
			return;

		if (x + (2L << size) < minx || y + (1L << size) < miny || minx - x + miny - y > (2L << size))
			return;

		if (size <= 1) {

			if (x >= minx && y >= miny)
				rm[(int) (y - miny)][(int) (x - minx)] = 'A';

			if (size == 1) {
				if (y + 1 < maxy && x + 1 < maxx && y + 1 >= miny && x + 1 >= minx)
					rm[(int) (y - miny + 1)][(int) (x - minx + 1)] = 'B';

				if (x + 2 < maxx && y >= miny && x + 2 >= minx)
					rm[(int) (y - miny)][(int) (x - minx + 2)] = 'B';
			}
		} else {
			draw(x, y, size - 1, rm, minx, miny, maxx, maxy);
			draw(x + (2L << (size - 1)), y, size - 1, rm, minx, miny, maxx, maxy);
			draw(x + (1L << (size - 1)), y + (1L << (size - 1)), size - 1, rm, minx, miny, maxx, maxy);
		}
	}

	private String[] convert(char[][] rm) {
		String[] res = new String[rm.length];

		for (int i = rm.length - 1; i >= 0; --i)
			res[i] = new String(rm[rm.length - 1 - i]);

		return res;
	}

	private ArrayList<Integer> buidPows(long t) {
		ArrayList<Integer> pows = new ArrayList<Integer>();
		int p = 0;
		while (t > 0) {
			if (t % 2 == 1)
				pows.add(p);

			p++;
			t >>= 1;
		}

		Collections.reverse(pows);
		return pows;
	}

}
