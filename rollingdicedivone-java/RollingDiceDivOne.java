/*
 * SRM536D1-500
 * SOLVED
 */

import java.util.*;

public class RollingDiceDivOne {

	/**
	 * In each step maximum-probability numbers lay on FLAT top of distribution.
	 * Also, distribution is obviously symmetric
	 * So new maximum-probability numbers are based on flat, moved right and reduced
	 */
	public long mostLikely(int[] dice) {
		Arrays.sort(dice);

		long start = 1;
		long len = dice[dice.length - 1];
		for (int i = dice.length - 2; i >= 0; --i) {
			int d = dice[i];

			if (d <= len) {
				start += d;
				len -= d - 1;
			} else {
				long s = d - len;

				if (s % 2 == 1) {
					start += d - s / 2 - 1;
					len = 2;
				} else {
					start += d - s / 2;
					len = 1;
				}
			}
		}

		return start;
	}

}
