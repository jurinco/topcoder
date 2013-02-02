/*
 * SRM159-D2-1000
 * SOLVED
 *
 * See: http://e-maxx.ru/algo/longest_increasing_subseq_log
 */

import static java.lang.Math.*;

public class ThePriceIsRight {

	public int[] howManyReveals(int[] prices) {
		int[] d = new int[prices.length];
		int[] c = new int[prices.length];

		for (int i = 0; i < prices.length; ++i) {
			int v = 1;

			for (int j = 0; j < i; ++j)
				if (prices[j] < prices[i])
					v = max(v, d[j] + 1);

			if (v > 1) {
				int vc = 0;

				for (int j = 0; j < i; ++j)
					if (prices[j] < prices[i] && v == d[j] + 1)
						vc += c[j];

				d[i] = v;
				c[i] = vc;
			} else {
				d[i] = v;
				c[i] = 1;
			}
		}

		int r = 0;
		for (int i = 0; i < prices.length; ++i)
			r = max(r, d[i]);

		int rc = 0;
		for (int i = 0; i < prices.length; ++i)
			if (d[i] == r)
				rc += c[i];

		return new int[] { r, rc };
	}

}
