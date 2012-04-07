/*
 * TCO12-1B-500
 * SOLVED
 * UGLY
 */

import java.util.*;
import static java.lang.Math.*;

public class FoxAndDoraemon {

	public int minTime(int[] workCost, int splitCost) {
		Arrays.sort(workCost);

		return minTime(workCost, splitCost, 0, workCost.length);
	}

	private Map<String, Integer> cache = new HashMap<String, Integer>();

	private int minTime(int[] workCost, int splitCost, int from, int to) {
		if (to == from)
			throw new Error();

		if (to - from == 1)
			return workCost[from];

		String key = from + "_" + to;
		Integer cacheRes = cache.get(key);

		if (cacheRes != null)
			return cacheRes;

		int res = Integer.MAX_VALUE;
		for (int m = from + 1; m <= to - 1; ++m) {
			res = min(res, splitCost + max(minTime(workCost, splitCost, from, m), minTime(workCost, splitCost, m, to)));
		}

		cache.put(key, res);

		return res;
	}

}
