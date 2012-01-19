/*
 * SRM520D2-1000
 * SOLVED
 */

import static java.lang.Math.*;

public class SRMSystemTestPhase {

	static final long M = 1000000007;

	public int countWays(String[] description) {
		int[] submissions = new int[description.length];
		for (int i = 0; i < description.length; i++) {
			String desc = description[i];
			int subm = 0;

			for (char c : desc.toCharArray())
				if (c == 'Y')
					subm++;

			submissions[i] = subm;
		}

		return (int) countWaysIt(submissions);
	}

	private long countWaysIt(int[] submissions) {
		long[][] counts = new long[4][4];

		for (int i = 0; i < 4; ++i)
			for (int j = 0; j < 4; ++j)
				counts[i][j] = 1;

		for (int st = submissions.length - 1; st >= 0; --st) {
			long[][] newCounts = new long[4][4];

			for (int passedBefore = 0; passedBefore < 4; ++passedBefore) {
				for (int challengedBefore = 0; challengedBefore < 4; ++challengedBefore) {
					int subm = submissions[st];
					long count = 0;

					for (int passed = 0; passed <= min(passedBefore, subm); ++passed) {
						int minChallenged = (passed == passedBefore) ? challengedBefore : 0;
						for (int challenged = minChallenged; challenged <= subm - passed; ++challenged)
							count = (count + (c(passed, subm) * c(challenged, subm - passed) * counts[passed][challenged]) % M) % M;
					}

					newCounts[passedBefore][challengedBefore] = count;
				}
			}

			counts = newCounts;
		}

		return counts[3][0];
	}

	private int c(int x, int y) {
		int res = 1;
		for (int i = y; i > x; --i)
			res *= i;
		for (int i = 1; i <= y - x; ++i)
			res /= i;
		return res;
	}
}
