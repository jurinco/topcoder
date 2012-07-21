/*
 * SRM546-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class KleofasTail {

	public long countGoodSequences(long K, long A, long B) {
		if (K == 0)
			return B - A + 1;

		long r = 0;

		if (K % 2 == 1) {
			if (K >= A && K <= B)
				r++;

			K *= 2;
		}

		for (long M = K + 2; K <= B; K *= 2, M *= 2) {
			long min = max(K, A);
			long max = min(M, B + 1);

			if (max > min)
				r += max - min;
		}

		return r;
	}

}
