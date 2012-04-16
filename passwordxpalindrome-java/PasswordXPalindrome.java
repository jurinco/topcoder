/*
 * TCO12-1C-1000
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class PasswordXPalindrome {

	static int INF = 1000000;

	private Map<String, Integer> cache = new HashMap<String, Integer>();

	public int minSwaps(String password) {
		int res = count(password);

		return res >= INF ? -1 : res;
	}

	public int count(String password) {
		if (password.length() < 2)
			return 0;

		char first = password.charAt(0);
		char last = password.charAt(password.length() - 1);

		if (first == last)
			return count(password.substring(1, password.length() - 1));

		if (cache.containsKey(password))
			return cache.get(password);

		int res = INF;
		int firstRep = password.indexOf(first, 1);
		int lastRep = password.indexOf(last);

		if (firstRep >= 0)
			res = min(res, count(swap(password, firstRep, password.length() - 1)) + 1);

		if (lastRep >= 0 && lastRep < password.length() - 1)
			res = min(res, count(swap(password, lastRep, 0)) + 1);

		cache.put(password, res);

		return res;
	}

	private String swap(String s, int i, int j) {
		if (i == j)
			return s;
		if (i > j)
			return swap(s, j, i);

		return s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1);
	}

}
