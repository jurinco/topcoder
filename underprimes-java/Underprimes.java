/*
 * SRM442-D1-250
 * SOLVED
 */

import java.util.*;

public class Underprimes {

	public int howMany(int A, int B) {
		BitSet primes = sieveBs(B);

		int c = 0;
		for (int i = A; i <= B; ++i)
			if (primes.get(countFacts(i)))
				c++;

		return c;
	}

	private int countFacts(int n) {
		int c = 0;

		while (n % 2 == 0) {
			n /= 2;
			c++;
		}

		for (int i = 3; i * i <= n; i += 2)
			while (n % i == 0) {
				n /= i;
				c++;
			}

		if (n > 1)
			c++;

		return c;
	}

	private BitSet sieveBs(int m) {
		BitSet primes = new BitSet(m + 1);
		primes.set(2, m + 1, true);

		for (int i = 2; i <= m; ++i)
			if (primes.get(i))
				for (int j = i + i; j <= m; j += i)
					primes.clear(j);

		return primes;
	}

}
