/*
 * SRM449-D2-500
 * SOLVED
 */

public class OddDivisors {

	public long findSum(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;

		long n = N;

		if (N % 2 == 1) {
			return (n + 1) * (n + 1) / 4 + findSum(N / 2);
		} else {
			return n * n / 4 + findSum(N / 2);
		}
	}

}
