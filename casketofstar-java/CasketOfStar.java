/*
 * SRM533-D1-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class CasketOfStar {

	public int maxEnergy(int[] weight) {
		return energy(weight, 0, weight.length - 1);
	}

	private HashMap<String, Integer> cache = new HashMap<String, Integer>();

	private int energy(int[] weight, int f, int l) {
		if (l <= f + 1)
			return 0;

		if (l <= f + 2)
			return weight[f] * weight[l];

		String key = f + "-" + l;

		Integer res = cache.get(key);
		if (res != null)
			return res;

		res = 0;

		for (int m = f + 1; m < l; ++m)
			res = max(res, energy(weight, f, m) + energy(weight, m, l));

		res += weight[f] * weight[l];

		cache.put(key, res);

		return res;
	}

}
