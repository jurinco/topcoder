/*
 * SRM192-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class BigCube {

	public String largestCube(String[] range) {
		long[] mins = new long[range.length];
		long[] maxs = new long[range.length];

		for (int i = 0; i < range.length; ++i) {
			String[] p = range[i].split("-");

			mins[i] = Long.valueOf(p[0]);
			maxs[i] = Long.valueOf(p[1]);
		}

		long max = 0;
		for (long m : maxs)
			max = max(max, m);

		long mq = -1;
		for (long i = 0;; ++i) {
			long q = i * i * i;

			if (q > max)
				break;

			if (inRanges(q, mins, maxs))
				mq = q;
		}

		return mq >= 0 ? String.valueOf(mq) : "";
	}

	private boolean inRanges(long q, long[] mins, long[] maxs) {
		for (int i = 0; i < mins.length; ++i)
			if (q >= mins[i] && q <= maxs[i])
				return true;

		return false;
	}

}
