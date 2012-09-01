/*
 * SRM544-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class TheBrickTowerEasyDivOne {

	public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
		int pairCount = min(redCount, blueCount);
		int count = pairCount * 2;

		if (redHeight != blueHeight)
			count += pairCount;

		if (redCount > pairCount || blueCount > pairCount)
			count++;

		return count;
	}

}
