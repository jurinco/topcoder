/*
 * SRM454-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class MinimalDifference {

	public int findNumber(int A, int B, int C) {
		C = sum(C);

		int md = abs(sum(A) - C);
		int mn = A;

		for (int i = A + 1; i <= B; ++i) {
			int d = abs(sum(i) - C);

			if (d < md) {
				md = d;
				mn = i;
			}

			if (md == 0)
				break;
		}

		return mn;
	}

	private int sum(int a) {
		int sum = 0;

		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}

		return sum;
	}

}
