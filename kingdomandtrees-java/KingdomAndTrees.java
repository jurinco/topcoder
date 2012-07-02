/*
 * SRM548-D1-250
 * SOLVED
 * UGLY
 */

import static java.lang.Math.*;

public class KingdomAndTrees {

	public int minLevel(int[] heights) {
		int lev = 0;
		int[] diffs = new int[heights.length];

		for (int i = 1; i < heights.length; ++i) {
			if (heights[i] - lev > heights[i - 1] + diffs[i - 1]) {
				diffs[i] = -lev;
			} else if (heights[i] + lev > heights[i - 1] + diffs[i - 1]) {
				diffs[i] = heights[i - 1] + diffs[i - 1] + 1 - heights[i];
			} else {
				int dl = (heights[i - 1] + diffs[i - 1] + 2 - heights[i] - lev) / 2;

				if (heights[i - 1] + diffs[i - 1] - dl >= i) {
					lev += dl;
					diffs[i] = heights[i - 1] + diffs[i - 1] - dl + 1 - heights[i];
				} else {
					lev = max(lev, i + 1 - heights[i]);
					diffs[i] = i + 1 - heights[i];
				}
			}
		}

		return lev;
	}

}
