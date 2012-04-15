/*
 * TCO12-1C-500
 * SOLVED
 */

import static java.lang.Math.*;

public class PasswordXGrid {

	public int minSum(String[] horizontal, String[] vertical) {
		int N = vertical.length;
		int M = horizontal[0].length();

		int maxSums[][] = new int[N + 1][M + 1];

		maxSums[N][M] = 0;

		for (int i = M - 1; i >= 0; --i)
			maxSums[N][i] = maxSums[N][i + 1] + (horizontal[N].charAt(i) - '0');

		for (int i = N - 1; i >= 0; --i)
			maxSums[i][M] = maxSums[i + 1][M] + (vertical[i].charAt(M) - '0');

		for (int i = N - 1; i >= 0; --i)
			for (int j = M - 1; j >= 0; --j)
				maxSums[i][j] = max(maxSums[i + 1][j] + (vertical[i].charAt(j) - '0'), maxSums[i][j + 1] + (horizontal[i].charAt(j) - '0'));

		return maxSums[0][0];
	}

}
