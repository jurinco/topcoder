/*
 * SRM531-D1-300
 * SOLVED
 * UGLY
 */

import java.util.*;

public class NoRepeatPlaylist {

	static long MOD = 1000000007;
	static int MAX = 100;

	private static long[][] binoms = new long[MAX + 1][MAX + 1];

	static {
		for (int i = 0; i <= MAX; ++i)
			Arrays.fill(binoms[i], -1);
	}

	public static long binom(int n, int k) {
		if (n < k || k < 0)
			return 0;

		if (n <= 1 || k == 0 || k == n)
			return 1;

		if (k == 1 || k == n - 1)
			return n;

		if (binoms[n][k] >= 0)
			return binoms[n][k];

		return binoms[n][k] = (binom(n - 1, k - 1) + binom(n - 1, k)) % MOD;
	}

	public int numPlaylists(int N, int M, int P) {
		long prod = numPlaylistsNoDiff(N, M, P);

		int sign = -1;
		for (int i = N - 1; i > 0; --i) {
			long dprod = numPlaylistsNoDiff(i, M, P) * binom(N, i);

			prod = (MOD + prod + sign * dprod) % MOD;
			sign = -sign;
		}

		return (int) prod;
	}

	private long numPlaylistsNoDiff(int N, int M, int P) {
		long prod = 1;

		for (int i = 0; i < M; ++i)
			prod = (prod * (N - i)) % MOD;

		for (int i = M; i < P; ++i)
			prod = (prod * (N - M)) % MOD;

		return prod;
	}

}
