/*
 * TCO12-1A-500
 * SOLVED
 */

public class EllysFractions {

	public long getCount(int N) {
		long sum = 1;

		if (N == 1)
			return 0;

		long count = 1;

		for (int i = 3; i <= N; ++i) {
			if (isPrime(i))
				count *= 2;

			sum += count;
		}

		return sum;
	}

	private boolean isPrime(int n) {
		for (int m = 2, e = (int) Math.sqrt(n); m <= e; ++m)
			if (n % m == 0)
				return false;

		return true;
	}

}
