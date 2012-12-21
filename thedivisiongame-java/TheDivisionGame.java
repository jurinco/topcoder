/*
 * SRM565-D1-250
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class TheDivisionGame {

	public static boolean[] sieveArr(int m) {
		boolean[] primes = new boolean[m + 1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i <= m; ++i)
			if (primes[i])
				for (int j = i + i; j <= m; j += i)
					primes[j] = false;

		return primes;
	}

	public long countWinningIntervals(int L, int R) {
		int[] memo = new int[10000000];
		int[] counts = new int[R - L + 1];
		boolean[] primeArr = sieveArr((int) sqrt(R) + 1);

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		for (int i = 2; i < primeArr.length; ++i)
			if (primeArr[i])
				primeList.add(i);

		System.out.println(primeList.size());

		Integer[] primes = primeList.toArray(new Integer[primeList.size()]);

		HashMap<Integer, Long> xors = new HashMap<Integer, Long>();
		HashMap<Integer, Long> nxors = new HashMap<Integer, Long>();
		long c = 0;

		for (int i = L; i <= R; ++i) {
			int count = countFacts(i, primes, memo);
			nxors.put(count, 1L);

			for (Map.Entry<Integer, Long> e : xors.entrySet()) {
				int nx = e.getKey() ^ count;

				if (nxors.containsKey(nx))
					nxors.put(nx, nxors.get(nx) + e.getValue());
				else
					nxors.put(nx, e.getValue());
			}

			if (nxors.containsKey(0))
				c += nxors.get(0);

			HashMap<Integer, Long> oxors = xors;
			xors = nxors;
			nxors = oxors;
			nxors.clear();
		}

		return (R - L + 2) * (R - L + 1) / 2 - c;
	}

	public static int countFacts(int n, Integer[] primes, int[] memo) {
		int c = 0;

		while (n % 2 == 0) {
			n /= 2;
			c++;
		}

		return c + countFacts(n, 1, primes, memo);
	}

	public static int countFacts(int n, int i, Integer[] primes, int[] memo) {
		if (n == 1)
			return 0;

		if (i >= primes.length)
			return 1;

		int p = primes[i];

		if (p * p > n)
			return 1;

		if (n < memo.length && memo[n] > 0)
			return memo[n];

		int c = 0;
		int nn = n;
		while (nn % p == 0) {
			nn /= p;
			c++;
		}

		int r = countFacts(nn, i + 1, primes, memo);

		if (n < memo.length)
			memo[n] = c + r;

		return c + r;
	}

}
