/*
 * SRM453-D1-250
 * SOLVED
 */

import java.util.*;

public class TheBasketballDivOne {

	public int find(int n, int m) {
		int c = n * (n - 1);
		HashSet<String> seqs = new HashSet<String>();

		for (int s = 0; s < (1 << c); ++s) {
			int[] wins = new int[n];

			int i = 0;
			for (int x = 0; x < n; ++x)
				for (int y = 0; y < n; ++y)
					if (x != y) {
						if ((s & (1 << i)) == 0)
							wins[x]++;
						else
							wins[y]++;
						i++;
					}

			Arrays.sort(wins);

			if (wins[wins.length - 1] == m) {
				StringBuilder b = new StringBuilder();

				for (int w : wins)
					b.append(w);

				seqs.add(b.toString());
			}
		}

		return seqs.size();
	}

}
