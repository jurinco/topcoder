/*
 * SRM197-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class GardenHose {

	public int countDead(int n, int rowDist, int colDist, int hoseDist) {
		int rowLive = hoseDist / rowDist;
		int colLive = hoseDist / colDist;

		return max(0, n - 2 * rowLive) * max(0, n - 2 * colLive);
	}

}
