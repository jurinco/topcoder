/*
 * SRM573-D1-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class TeamContest {

	public int worstRank(int[] s) {
		int n = s.length / 3;
		int st = max(max(s[0], s[1]), s[2]) + min(s[0], min(s[1], s[2]));

		s[0] = 0;
		s[1] = 0;
		s[2] = 0;

		Arrays.sort(s);

		int r = 1;
		for (int i = n * 3 - 1; i >= 2 * n + 1; --i) {
			boolean found = false;
			for (int j = 0; j < i - 1 && !found; ++j)
				if (s[j] > 0 && s[j] + s[i] > st) {
					s[i] = 0;
					s[j] = 0;
					r++;
					found = true;

					for (int k = j + 1; k < i; ++k)
						if (s[k] > 0) {
							s[k] = 0;
							break;
						}
				}

			if (!found)
				return r;
		}

		return r;
	}

}
