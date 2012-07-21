/*
 * SRM152-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FixedPointTheorem {

	public double cycleRange(double R) {
		double X = 0.25;

		for (int i = 0; i <= 200000; ++i)
			X = R * X * (1 - X);

		double min = X;
		double max = X;

		for (int i = 0; i < 1000; ++i) {
			X = R * X * (1 - X);
			min = min(X, min);
			max = max(X, max);
		}

		return max - min;
	}

}
