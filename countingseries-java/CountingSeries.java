/*
 * SRM523-D1-250
 * SRM523-D2-500
 * SOLVED
 */

public class CountingSeries {

	public long countThem(long a, long b, long c, long d, long upperBound) {
		long count = upperBound >= a ? (upperBound - a) / b + 1 : 0;

		if (d == 1)
			return count + (c <= upperBound && (c < a || (c - a) % b > 0) ? 1 : 0);

		long v = c;
		while (v <= upperBound) {
			if (v < a || (v - a) % b > 0)
				count++;

			v *= d;
		}

		return count;

	}

}
