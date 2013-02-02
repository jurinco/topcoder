/*
 * SRM191-D2-500
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class VolumeGuess {

	public int correctVolume(String[] queries, int numberOfBoxes, int ithBox) {
		int[] volumes = new int[numberOfBoxes + 1];

		Arrays.fill(volumes, -1);

		for (String s : queries) {
			String[] p = s.split(",");

			int b1 = Integer.valueOf(p[0]);
			int b2 = Integer.valueOf(p[1]);
			int v = Integer.valueOf(p[2]);

			volumes[b1] = max(volumes[b1], v);
			volumes[b2] = max(volumes[b2], v);
		}

		return volumes[ithBox];
	}
}
