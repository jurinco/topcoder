/*
 * SRM545-D1-275
 * SOLVED
 */

import static java.lang.Math.*;

public class Spacetsk {

	static final long M = 1000000007;

	public int countsets(int L, int H, int K) {
		if (K > H + 1)
			return 0;

		if (K == 1)
			return (L + 1) * (H + 1);

		long count = binom(H + 1, K) * (L + 1) + countNakl(L, H, K) * 2;

		return (int) (count % M);
	}

	private long countNakl(int L, int H, int K) {
		long res = 0;

		for (int sl = 1; sl <= L; ++sl)
			for (int sh = 1; sh <= H; ++sh)
				if (gcd(sl, sh) == 1) {
					int hst = H / sh;
					int lst = L / sl;
					int st = min(hst, lst);

					res = (res + (L - st * sl + 1) * binom(st + 1, K)) % M;

					for (int l = st * sl - 1; l > 0; l -= sl) {
						int llst = l / sl;

						res = (res + sl * binom(min(hst, llst) + 1, K)) % M;
					}
				}

		return res;
	}

	private static long[] facts;
	private static long[] invFacts;

	{
		int max = 2010;

		facts = new long[max + 1];
		invFacts = new long[max + 1];

		facts[0] = 1;
		invFacts[0] = 1;

		long cur = 1;

		for (int i = 1; i <= max; ++i) {
			cur = (cur * i) % M;

			facts[i] = cur;
			invFacts[i] = pow(cur, M - 2);
		}
	}

	private long pow(long c, long p) {
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

	private long binom(int D, int K) {
		if (D < K)
			return 0;

		if (K == 1)
			return D;

		return (((facts[D] * invFacts[K]) % M) * invFacts[D - K]) % M;
	}

	private int gcd(int a, int b) {
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
