public class CountingSeries {

	private boolean inArithm(long n, long a, long b) {
		return (n - a) % b == 0 && n >= a;
	}

	public long countThem(long a, long b, long c, long d, long upperBound) {
		long count = 0;

		if (a > upperBound)
			count = 0;
		else
			count = (upperBound - a) / b + 1;

		if (d == 1) {
			if (c <= upperBound && !inArithm(c, a, b))
				count++;
		} else {
			long n = c;
			while (n <= upperBound) {
				if (!inArithm(n, a, b))
					count++;

				n = n * d;
			}
		}

		return count;
	}

}
