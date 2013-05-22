/*
 * SRM466-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class LotteryCheating {

	public int minimalChange(String ID) {
		long max = 1;

		for (int i = 0; i < ID.length(); ++i)
			max *= 10;

		int min = Integer.MAX_VALUE;

		for (long i = 0; i * i < max; ++i)
			min = min(min, distance(ID, i * i));

		return min;
	}

	private int distance(String s, long n) {
		String ns = String.valueOf(n);

		int d = 0;
		for (int i = 0; i < s.length(); ++i)
			if (s.charAt(s.length() - i - 1) != (i < ns.length() ? ns.charAt(ns.length() - i - 1) : '0'))
				d++;

		return d;
	}

}
