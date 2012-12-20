/*
 * SRM464-D2-500
 * SOLVED
 */

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ColorfulStrings {

	class Found extends Exception {
		private static final long serialVersionUID = 1L;

		public final String res;

		public Found(String s) {
			res = s;
		}
	}

	public String getKth(int n, int k) {
		if (n >= 10)
			return "";

		try {
			genstr(n, k, "", new boolean[10], new AtomicInteger(0));
		} catch (Found e) {
			return e.res;
		}

		return "";
	}

	int counter = 0;

	private void genstr(int n, int k, String s, boolean[] bs, AtomicInteger c) throws Found {
		if (!good(s))
			return;

		if (s.length() == n) {
			if (c.incrementAndGet() == k)
				throw new Found(s);
			else
				return;
		}

		for (char i = 0; i < 10; ++i)
			if (!bs[i]) {
				bs[i] = true;
				genstr(n, k, s + (char) ('0' + i), bs, c);
				bs[i] = false;
			}
	}

	private boolean good(String s) {
		HashSet<Integer> prod = new HashSet<Integer>();

		for (int i = 0; i < s.length(); ++i)
			for (int j = i; j < s.length(); ++j) {
				int p = 1;

				for (int k = i; k <= j; ++k)
					p *= s.charAt(k) - '0';

				if (!prod.add(p))
					return false;
			}

		return true;
	}

}
