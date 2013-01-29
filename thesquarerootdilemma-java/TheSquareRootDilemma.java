/*
 * SRm567-D2-500
 * SOLVED
 */

public class TheSquareRootDilemma {

	public int countPairs(int N, int M) {
		if (N > M)
			return countPairs(M, N);

		int cnt = 0;

		for (int c = 1; c <= N; ++c) {
			if (divSqr(c))
				continue;

			int ai = 1, bi = 1;

			while (ai * ai * c <= N)
				ai++;

			while (bi * bi * c <= M)
				bi++;

			cnt += (ai - 1) * (bi - 1);
		}

		return cnt;
	}

	boolean divSqr(int n) {
		for (int i = 2; i * i <= n; ++i)
			if (n % (i * i) == 0)
				return true;
		return false;
	}

}
