package arithmetic;

public class PrimeModulo {

	public static long M = 3571;
	public static int MAX = 2010;

	private static long[] facts;
	private static long[] invFacts;

	static {
		facts = new long[MAX + 1];
		invFacts = new long[MAX + 1];

		facts[0] = 1;
		invFacts[0] = 1;

		long cur = 1;

		for (int i = 1; i <= MAX; ++i) {
			cur = (cur * i) % M;

			facts[i] = cur;
			invFacts[i] = binpow(cur, M - 2);
		}
	}

	public static long inv(long c) {
		return binpow(c, M - 2);
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

	public static long binom(int n, int k) {
		if (n < k || k < 0)
			return 0;

		if (n <= 1 || k == 0 || k == n)
			return 1;

		if (k == 1 || k == n - 1)
			return n;

		return (((facts[n] * invFacts[k]) % M) * invFacts[n - k]) % M;
	}

	public static long catalan(int n) {
		return (binom(2 * n, n) * inv(n + 1)) % M;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i)
			System.out.println(catalan(i));
	}
}
