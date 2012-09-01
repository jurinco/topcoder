/*
 * SRM453-D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class TheBasketballDivTwo {

	public int find(String[] table) {
		int w = table[0].length();
		int h = table.length;

		int gc = 0;
		for (int y = 0; y < h; ++y)
			for (int x = 0; x < w; ++x)
				if (table[y].charAt(x) == '?')
					gc++;

		int minWins = table.length * 2;

		for (int s = 0; s < (1 << gc); ++s) {
			int[] wins = new int[table.length];

			int i = 0;
			for (int y = 0; y < h; ++y)
				for (int x = 0; x < w; ++x)
					if (table[y].charAt(x) == 'W')
						wins[y]++;
					else if (table[y].charAt(x) == 'L')
						wins[x]++;
					else if (x != y) {
						if ((s & (1 << i)) == 0)
							wins[y]++;
						else
							wins[x]++;

						i++;
					}

			minWins = min(minWins, armax(wins));
		}

		return minWins;
	}

	private int armax(int[] arr) {
		int am = 0;
		for (int r : arr)
			am = max(am, r);
		return am;
	}

}
