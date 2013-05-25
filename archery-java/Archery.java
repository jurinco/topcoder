/*
 * SRM462-D2-250
 * SOLVED
 */

public class Archery {

	public double expectedPoints(int N, int[] ringPoints) {
		double num = 0;
		double den = 0;

		for (int i = 0; i <= N; ++i) {
			int sq = 2 * i + 1;

			num += sq * ringPoints[i];
			den += sq;
		}

		return num / den;
	}

}
