/*
 * SRM440-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class IncredibleMachine {

	public double gravitationalAcceleration(int[] x, int[] y, int T) {
		double d = 0.0;
		double tg = 0.0;

		for (int i = 1; i < x.length; ++i) {
			double dx = x[i] - x[i - 1];
			double dy = y[i - 1] - y[i];

			double nd = d + 2 * dy;

			tg += 2 * sqrt(dx * dx + dy * dy) / (sqrt(nd) + sqrt(d));
			d = nd;
		}

		return tg * tg / T / T;
	}

}
