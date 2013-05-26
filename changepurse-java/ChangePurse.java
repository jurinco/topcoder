/*
 * SRM195-D2-1100
 * SOLVED
 */

import java.util.*;

public class ChangePurse {

	public int[] optimalCoins(int[] coinTypes, int value) {
		int[] coinTypesSorted = coinTypes.clone();

		Arrays.sort(coinTypesSorted);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);

		for (int i = 1; i < coinTypesSorted.length; ++i) {
			int val = coinTypesSorted[i] - 1;

			for (int j = i - 1; j >= 0; --j)
				if (val % coinTypesSorted[j] == coinTypesSorted[j] - 1 && map.containsKey(coinTypesSorted[j] - 1)) {
					map.put(val, coinTypesSorted[j]);
					break;
				}
		}

		Map<Integer, Integer> res = new HashMap<Integer, Integer>();

		while (value > 0) {
			for (int i = coinTypesSorted.length - 1; i >= 0; --i) {
				if (value >= coinTypesSorted[i] && value % coinTypesSorted[i] == coinTypesSorted[i] - 1 && map.containsKey(coinTypesSorted[i] - 1)) {
					res.put(coinTypesSorted[i], value / coinTypesSorted[i]);
					value = coinTypesSorted[i] - 1;
					break;
				}
			}
		}

		return toArray(coinTypes, res);
	}

	private int[] toArray(int[] coinTypes, Map<Integer, Integer> res) {
		int[] resArr = new int[coinTypes.length];

		for (int i = 0; i < coinTypes.length; ++i)
			resArr[i] = res.containsKey(coinTypes[i]) ? res.get(coinTypes[i]) : 0;

		return resArr;
	}
}
