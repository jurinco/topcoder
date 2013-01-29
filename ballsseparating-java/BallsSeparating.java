/*
 * SRM568-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class BallsSeparating {

	public int minOperations(int[] red, int[] green, int[] blue) {

		if (red.length < 3)
			return -1;

		int c = Integer.MAX_VALUE;

		for (int ri = 0; ri < red.length; ++ri)
			for (int bi = 0; bi < red.length; ++bi)
				for (int gi = 0; gi < red.length; ++gi)
					if (bi != ri && gi != ri && gi != bi) {
						int lc = 0;

						for (int i = 0; i < red.length; ++i)
							if (i == ri)
								lc += green[i] + blue[i];
							else if (i == gi)
								lc += red[i] + blue[i];
							else if (i == bi)
								lc += red[i] + green[i];
							else
								lc += min(red[i] + green[i], min(red[i] + blue[i], green[i] + blue[i]));

						c = min(c, lc);
					}

		return c;
	}

}
