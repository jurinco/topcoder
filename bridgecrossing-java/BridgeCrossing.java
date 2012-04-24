/*
 * SRM146-D2-1000
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class BridgeCrossing {

	public int minTime(int[] times) {
		if (times.length == 1)
			return times[0];

		Arrays.sort(times);

		BitSet people = new BitSet(times.length);
		people.set(0, times.length);

		return minTime(people, times);
	}

	private int minTime(BitSet set, int[] times) {
		if (set.isEmpty())
			return 0;

		int min = Integer.MAX_VALUE;
		for (int first = 0; first < times.length; ++first)
			if (set.get(first))
				for (int second = 0; second < times.length; ++second)
					if (set.get(second) && first != second)
						min = min(min, minTime(set, first, second, times));

		return min;
	}

	private int minTime(BitSet set, int first, int second, int[] times) {
		int time = max(times[first], times[second]);

		if (set.cardinality() == 2)
			return time;

		set.clear(first);
		set.clear(second);

		int back = fastest(set, times);

		set.set(back);

		time += times[back];
		time += minTime(set, times);

		set.clear(back);
		set.set(first);
		set.set(second);

		return time;
	}

	private int fastest(BitSet set, int[] times) {
		for (int i = 0; i < times.length; ++i)
			if (!set.get(i))
				return i;

		throw new Error();
	}

}
