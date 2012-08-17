/*
 * SRM522-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FoxPaintingBalls {

	public long theMax(long R, long G, long B, int N) {
		if (N == 1)
			return R + G + B;

		long size = N * ((long) N + 1) / 2;
		long c = size / 3;

		if (size % 3 == 0)
			return min(R / c, min(G / c, B / c));

		return min(min((R + G + B) / (3 * c + 1), R / c), min(G / c, B / c));
	}

}
