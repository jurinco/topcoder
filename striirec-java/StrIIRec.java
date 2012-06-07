/*
 * SRM545-D1-275
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class StrIIRec {

	public String recovstr(int n, int minInv, String minStr) {
		BitSet used = new BitSet(n);
		String res = solve(n, n, minInv, minStr, used);

		return res;
	}

	private String solve(int n, int c, int minInv, String minStr, BitSet used) {
		if (n == 0)
			return "";

		char first;
		String next;
		if (minStr.length() > 0) {
			first = minStr.charAt(0);
			next = minStr.substring(1);
		} else {
			first = 'a';
			next = "";
		}

		// учесть отсутствие дубликатв
		while (first <= 'a' + c) {
			if (!used.get(first - 'a')) {
				int alrInv = 0;

				for (char cc = 'a'; cc < first; ++cc)
					if (!used.get(cc - 'a'))
						alrInv++;

				alrInv = min(alrInv, n - 1);
				int maxInv = alrInv + (n - 1) * (n - 2) / 2;

				if (maxInv >= minInv) {
					used.set(first - 'a');
					return first + solve(n - 1, c, minInv - alrInv, next, used);
				}
			}

			next = "";
			first++;
		}

		return null;
	}

}
