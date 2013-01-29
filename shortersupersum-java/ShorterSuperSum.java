/*
 * SRM467-D2-250
 * SOLVED
 */

import java.util.*;

public class ShorterSuperSum {

	private static int[][] memo = new int[15][15];

	static {
		for (int i = 0; i < memo.length; ++i)
			Arrays.fill(memo[i], -1);
	}

	public int calculate(int k, int n) {
		if (k == 0)
			return n;

		if (memo[k][n] >= 0)
			return memo[k][n];

		int res = 0;
		for (int i = 1; i <= n; ++i)
			res += calculate(k - 1, i);

		return memo[k][n] = res;
	}

}
