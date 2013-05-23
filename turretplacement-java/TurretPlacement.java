/*
 * SRM465-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class TurretPlacement {

	public long count(int[] x, int[] y) {
		long c = 0;

		for (int i = 0; i < x.length; ++i)
			for (int j = i + 1; j < x.length; ++j) {
				int ax = x[i], ay = y[i], bx = x[j], by = y[j];
				long n = (long) (sqrt(sqr(ax - bx) + sqr(ay - by)) * 2);

				c += n * (n - 1) / 2;
			}

		return c;
	}

	private double sqr(double x) {
		return x * x;
	}

}
