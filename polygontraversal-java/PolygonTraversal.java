/*
 * SRM574-D1-450
 * SOLVED
 */

import java.util.*;

public class PolygonTraversal {

	public long count(int N, int[] points) {
		if (points.length < 3)
			return 0;

		int visited = 0;

		for (int p : points)
			visited |= (1 << (p - 1));

		long[] memo = new long[N << N];
		Arrays.fill(memo, -1);
		return count(points[points.length - 1] - 1, points[0] - 1, N, visited, memo);
	}

	private long count(int cur, int first, int n, int visited, long[] memo) {
		int key = (cur << n) | visited;

		if (memo[key] >= 0)
			return memo[key];

		long res = 0;

		if (visited == (1 << n) - 1) {

			if (cur != (first + 1) % n && first != (cur + 1) % n)
				res++;

		} else {

			for (int next = 0; next < n; ++next)
				if ((visited & (1 << next)) == 0 && split(cur, next, n, visited) && split(next, cur, n, visited))
					res += count(next, first, n, visited | (1 << next), memo);

		}

		return memo[key] = res;
	}

	private boolean split(int i, int to, int n, int visited) {
		i = (i + 1) % n;

		while (i != to) {
			if ((visited & (1 << i)) != 0)
				return true;

			i = (i + 1) % n;
		}

		return false;
	}

}
