/*
 * SRM438-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class FeudaliasBattle {

	public double getMinimumTime(int[] baseX, int[] baseY, int[] siloX, int[] siloY, int toSec, int re, int speed) {
		double[][] dist = new double[siloX.length][baseX.length];

		for (int i = 0; i < siloX.length; i++)
			for (int j = 0; j < baseX.length; j++)
				dist[i][j] = sqrt(sqr(baseX[j] - siloX[i]) + sqr(baseY[j] - siloY[i]));

		double to = toSec / 60.0;
		double time = Double.POSITIVE_INFINITY;

		for (int i = 0; i < 4; ++i) {
			int s0 = i & 1;
			int s1 = i >> 1;

			if (s0 == s1) {
				time = min(time, max(to + dist[s0][0] / speed, to * 2 + re + dist[s1][1] / speed));
				time = min(time, max(to + dist[s1][1] / speed, to * 2 + re + dist[s0][0] / speed));
			} else {
				time = min(time, max(to + dist[s1][1] / speed, to + dist[s0][0] / speed));
			}
		}

		return time;
	}

	private double sqr(double d) {
		return d * d;
	}

}
