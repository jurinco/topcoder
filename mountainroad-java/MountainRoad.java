/*
 * SRM449-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class MountainRoad {

	public double findDistance(int[] start, int[] finish) {
		int min = start[0];
		int max = finish[0];

		for (int i = 0; i < start.length; ++i) {
			min = min(min, start[i]);
			max = max(max, finish[i]);
		}

		return (max - min) * sqrt(2);
	}

}
