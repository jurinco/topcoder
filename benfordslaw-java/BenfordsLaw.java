/*
 * SRM155-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class BenfordsLaw {

	public int questionableDigit(int[] transactions, int threshold) {
		int[] counts = new int[10];

		for (int t : transactions) {
			int d = 0;

			while (t > 0) {
				d = t % 10;
				t /= 10;
			}

			counts[d]++;
		}

		for (int i = 1; i < 10; ++i) {
			double real = counts[i] * 1.0 / transactions.length;
			double exp = log(1 + 1.0 / i) / log(10);

			if (real >= exp * threshold || real <= exp / threshold)
				return i;
		}

		return -1;
	}

}
