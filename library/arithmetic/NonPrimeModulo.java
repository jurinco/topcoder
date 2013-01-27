package arithmetic;

import java.util.Arrays;

public class NonPrimeModulo {

	private static int M = 12345;
	private static int MAX = 1000;

	private static long[][] binoms = new long[MAX + 1][MAX + 1];

	static {
		for (int i = 0; i <= MAX; ++i)
			Arrays.fill(binoms[i], -1);
	}

	public static long binom(int n, int k) {
		if (n < k || k < 0)
			return 0;

		if (n <= 1 || k == 0 || k == n)
			return 1;

		if (k == 1 || k == n - 1)
			return n;

		if (binoms[n][k] >= 0)
			return binoms[n][k];

		return binoms[n][k] = (binom(n - 1, k - 1) + binom(n - 1, k)) % M;
	}

	public static long binpow(long c, long p) {
		long res = 1;

		while (p > 0) {
			if (p % 2 == 0) {
				c = (c * c) % M;
				p /= 2;
			} else {
				res = (res * c) % M;
				p--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j <= i; ++j)
				System.out.print(binom(i, j) + " ");
			System.out.println();
		}
	}

}
