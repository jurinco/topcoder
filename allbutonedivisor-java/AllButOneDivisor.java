/*
 * TCO11-1C-250
 * SOLVED
 */

import static java.lang.Math.*;

public class AllButOneDivisor {

	public int getMinimum(int[] divisors) {
		int min = Integer.MAX_VALUE;

		int c = 1 << divisors.length;
		for (int i = 0; i < c; ++i) {
			int count = 0;
			int value = 1;
			boolean good = true;

			for (int j = 0; j < divisors.length; ++j)
				if ((i & (1 << j)) > 0) {
					count++;
					value = value * divisors[j] / gcd(value, divisors[j]);
				}

			for (int j = 0; j < divisors.length; ++j)
				if ((i & (1 << j)) == 0 && value % divisors[j] == 0) {
					good = false;
					break;
				}

			if (good && count == divisors.length - 1)
				min = min(value, min);
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}

	int gcd(int a, int b) {
		if (a > b)
			return gcd(b, a);

		while (a > 0) {
			int c = a;
			a = b % a;
			b = c;
		}

		return b;
	}

}
