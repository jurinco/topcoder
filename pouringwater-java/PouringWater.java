/*
 * SRM439-D1-250
 * SOLVED
 */

public class PouringWater {

	public int getMinBottles(int N, int K) {
		for (int i = 0; i < K - 1; ++i)
			if (N > 0) {
				int x = 1;
				while (2 * x <= N)
					x *= 2;

				N -= x;
			}

		if (N == 0)
			return 0;

		int x = 1;
		while (x < N)
			x *= 2;

		return x - N;
	}

}
