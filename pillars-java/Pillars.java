/*
 * SRM547-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class Pillars {

	public double getExpectedLength(int w, int x, int y) {
		double sum = len(0, w) * min(x, y);

		for (int i = 1; i < y; ++i)
			sum += len(i, w) * min(y - i, x);

		for (int i = 1; i < x; ++i)
			sum += len(i, w) * min(x - i, y);

		return sum / x / y;
	}

	private double len(long d, long w) {
		return sqrt(d * d + w * w);
	}

}
