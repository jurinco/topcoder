/*
 * SRM520D2-500
 * SOLVED
 */

import static java.lang.Math.*;

public class SRMCodingPhase {

	final static int count = 3;
	final static int[] mults = new int[] { 2, 4, 8 };

	public int countScore(int[] points, int[] skills, int luck) {
		return countScore(points, skills, luck, 0, 75);
	}

	private int countScore(int[] points, int[] skills, int luck, int st, int time) {
		if (st >= points.length || time <= 0)
			return 0;

		if (st == points.length - 1 && time >= max(skills[st] - luck, 1)) {
			return points[st] - mults[st] * max(skills[st] - luck, 1);
		} else {
			int best = countScore(points, skills, luck, st + 1, time);

			for (int i = 0; i <= min(luck, skills[st] - 1); ++i)
				if (time + i - skills[st] >= 0)
					best = max(best, points[st] - mults[st] * (skills[st] - i) + countScore(points, skills, luck - i, st + 1, time + i - skills[st]));

			return best;
		}
	}

}
