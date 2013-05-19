/*
 * SRM477-D2-900
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class ImportsList {

	public int[] importsCount(String[] requires) {
		int n = requires.length;

		boolean[][] m = new boolean[n][n];

		for (int y = 0; y < n; ++y)
			for (int x = 0; x < n; ++x)
				m[y][x] = requires[y].charAt(x) == 'Y';

		for (int i = 0; i < n; ++i)
			for (int j = 0; j < n; ++j)
				if (requires[i].charAt(j) == 'Y') {
					boolean trans = false;

					for (int k = 0; k < n; ++k)
						if (requires[i].charAt(k) == 'Y' && requires[k].charAt(j) == 'Y')
							trans = true;

					if (trans)
						m[i][j] = false;

				}

		int[] res = new int[n];
		for (int i = 0; i < n; ++i) {
			res[i] = 0;
			for (int j = 0; j < n; ++j)
				if (m[i][j])
					res[i]++;

		}

		return res;
	}


}
