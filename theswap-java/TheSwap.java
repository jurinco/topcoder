/*
 * SRM437-D2-500
 * SRM437-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class TheSwap {

	public int findMax(int n, int k) {
		if (k == 0)
			return n;

		if (k <= 3) {
			int best = -1;

			for (int jm = 1; jm <= n; jm *= 10)
				for (int im = jm * 10; im <= n; im *= 10)
					best = max(best, findMax(permute(n, im, jm), k - 1));

			if (best < 0)
				return -1;

			return best;
		} else {
			for (int iter = 0; iter < k - 3; ++iter) {
				int best = -1;

				for (int jm = 1; jm <= n; jm *= 10)
					for (int im = jm * 10; im <= n; im *= 10)
						best = max(best, permute(n, im, jm));

				if (best < 0)
					return -1;

				n = best;

			}

			return findMax(n, 2);
		}
	}

	private int permute(int n, int im, int jm) {
		if ((n / im) < 10 && (n / jm) % 10 == 0)
			return -1;

		int iv = (n / im) % 10;
		int jv = (n / jm) % 10;

		return (n / (im * 10)) * (im * 10) + jv * im + ((n % im) / (jm * 10)) * (jm * 10) + iv * jm + (n % jm);
	}

}
