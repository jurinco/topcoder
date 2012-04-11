/*
 * SRM540D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class ImportantSequence {

	private static long INF = 100000000000L;

	public int getCount(int[] B, String operators) {
		boolean a = true;

		long b = 0;
		long min = 1;
		long max = INF;

		for (int i = 0; i < B.length; ++i) {
			if (operators.charAt(i) == '+') {
				a = !a;
				b = B[i] - b;
			} else {
				b = b - B[i];
			}

			if (a)
				min = max(min, 1 - b);
			else
				max = min(max, b - 1);
		}

		if (max >= INF)
			return -1;

		if (max < min)
			return 0;

		return (int) (max - min + 1);
	}

}
