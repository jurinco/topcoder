/*
 * SRM160-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class Intersect {

	public int area(int[] x, int[] y) {
		int minx = Integer.MIN_VALUE;
		int miny = Integer.MIN_VALUE;
		int maxx = Integer.MAX_VALUE;
		int maxy = Integer.MAX_VALUE;

		for (int i = 0; i < x.length; i += 2) {
			minx = max(minx, min(x[i], x[i + 1]));
			miny = max(miny, min(y[i], y[i + 1]));
			maxx = min(maxx, max(x[i], x[i + 1]));
			maxy = min(maxy, max(y[i], y[i + 1]));
		}

		if (minx >= maxx)
			return 0;

		if (miny >= maxy)
			return 0;

		return (maxx - minx) * (maxy - miny);
	}

}
