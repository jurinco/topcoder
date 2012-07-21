/*
 * SRM448-D2-1000
 * SOLVED
 */

import java.util.*;

public class TheCardLineDivTwo {

	private static final long M = 1234567891;

	private long[] cache;

	public int count(String[] cards) {
		cache = new long[cards.length << cards.length];
		Arrays.fill(cache, -1);

		for (int i = 0; i < cards.length; ++i)
			cache[i << cards.length] = 1;

		long sum = 0;

		for (int i = 0; i < cards.length; ++i) {
			sum += count(i, (1 << cards.length) - 1 - (1 << i), cards);
		}

		return (int) (sum % M);
	}

	private long count(int c, int unused, String[] cards) {
		int key = (c << cards.length) | unused;

		if (cache[key] >= 0)
			return cache[key];

		String cur = cards[c];

		long sum = 0;

		for (int i = 0; i < cards.length; ++i)
			if ((unused & (1 << i)) != 0 && (cur.charAt(0) == cards[i].charAt(0) || sameColor(cur.charAt(1), cards[i].charAt(1))))
				sum += count(i, unused - (1 << i), cards);

		return cache[key] = ((int) (sum % M));
	}

	private boolean sameColor(char c1, char c2) {
		return (c1 == 'S' || c1 == 'C') == (c2 == 'S' || c2 == 'C');
	}
}
