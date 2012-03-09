/*
 * SRM534D1-500
 * SOLVED
 */

import java.util.*;

public class EllysNumbers {

	public long getSubsets(long n, String[] specialArr) {
		long[] specialNums = getLongs(specialArr);

		boolean hasOne = specialNums[0] == 1;

		if (n == 1) {
			return hasOne ? 1 : 0;
		} else {
			int specStart = hasOne ? 1 : 0;
			int specEnd = specialNums.length;

			while (specEnd > 0 && specialNums[specEnd - 1] > n)
				specEnd--;

			boolean hasSelf = specEnd > 0 && specialNums[specEnd - 1] == n;

			if (hasSelf)
				specEnd--;

			ArrayList<Long> basis = new ArrayList<Long>(1);
			ArrayList<Long> mults = new ArrayList<Long>(specEnd - specStart);

			basis.add(n);

			for (long l : specialNums) {
				if (l == 1 || l >= n)
					continue;

				ArrayList<Long> newBasis = new ArrayList<Long>(20);
				boolean failed = false;

				for (long b : basis) {
					long a = gcd(l, b);

					if (a == 1 || a == b) {
						newBasis.add(b);
					} else {
						long c = b / a;
						if (gcd(a, c) == 1) {
							newBasis.add(a);
							newBasis.add(c);
						} else {
							failed = true;
							break;
						}
					}
				}

				if (!failed) {
					mults.add(l);
					basis = newBasis;
				}
			}

			long count = countFrom(n, basis, mults, new HashMap<Long, Long>());

			if (hasSelf)
				count++;
			if (hasOne)
				count *= 2;

			return count;
		}
	}

	private long countFrom(long n, List<Long> basis, List<Long> mults, Map<Long, Long> cache) {
		if (n == 1)
			return 1;

		if (cache.containsKey(n))
			return cache.get(n);

		long base = findFirstBase(n, basis);

		long count = 0;
		for (long m : mults) {
			if (m % base != 0)
				continue;
			if (n % m != 0)
				continue;

			count += countFrom(n / m, basis, mults, cache);
		}

		cache.put(n, count);

		return count;
	}

	private long findFirstBase(long n, List<Long> basis) {
		for (long m : basis)
			if (n % m == 0)
				return m;

		throw new Error("Base not found");
	}

	private long[] getLongs(String[] special) {
		StringBuilder b = new StringBuilder();
		for (String s : special)
			b.append(s);
		String[] specialStrs = b.toString().split(" ");
		long[] specialNums = new long[specialStrs.length];

		for (int i = 0; i < specialStrs.length; ++i)
			specialNums[i] = Long.valueOf(specialStrs[i]);

		Arrays.sort(specialNums);

		return specialNums;
	}

	private long gcd(long a, long b) {
		if (a > b)
			return gcd(b, a);

		while (a > 0) {
			long c = b;

			b = a;
			a = c % a;
		}

		return b;
	}

}
