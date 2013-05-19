/*
 * SRM469-D2-600
 * SOLVED
 */

import java.util.*;

public class TheMoviesLevelTwoDivTwo {

	final static int INITIAL = 74;
	final static int ADD = 47;

	public int[] find(int[] length, int[] scary) {
		int[][] best = new int[1][0];

		find(length, scary, INITIAL, new ArrayList<Integer>(), best);

		BitSet watched = new BitSet(length.length);
		for (int m : best[0])
			watched.set(m);

		int[] res = new int[length.length];

		int i = 0;
		for (int m : best[0])
			res[i++] = m;

		for (int m = 0; m < length.length; ++m)
			if (!watched.get(m))
				res[i++] = m;

		return res;
	}

	private void find(int[] length, int[] scary, int cur, ArrayList<Integer> watched, int[][] best) {
		if (watched.size() > best[0].length) {
			best[0] = new int[watched.size()];

			int i = 0;
			for (int m : watched)
				best[0][i++] = m;
		}

		for (int i = 0; i < length.length; ++i)
			if (!watched.contains(i) && cur - scary[i] >= 0 && cur + ADD - length[i] >= 0) {
				watched.add(i);
				find(length, scary, cur + ADD - length[i], watched, best);
				watched.remove(watched.size() - 1);
			}
	}

}
