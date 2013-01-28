/*
 * SRM565-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class MonstersValley {

	public int minimumPrice(long[] dread, int[] price) {
		long maxDread[][] = new long[dread.length][dread.length * 2 + 1];

		for (int i = 0; i < dread.length; ++i) {
			for (int j = 0; j < dread.length * 2; ++j) {
				maxDread[i][j] = -1;
			}
		}

		maxDread[0][price[0]] = dread[0];

		for (int s = 1; s < dread.length; ++s) {
			for (int c = 0; c <= s * 2; ++c)
				if (maxDread[s - 1][c] >= 0) {
					long dr = maxDread[s - 1][c];

					if (dr >= dread[s])
						maxDread[s][c] = max(maxDread[s][c], dr);

					maxDread[s][c + price[s]] = max(maxDread[s][c + price[s]], dr + dread[s]);
				}
		}

		for (int i = 0; i <= dread.length * 2; ++i)
			if (maxDread[dread.length - 1][i] >= 0)
				return i;

		return -1;
	}

}
