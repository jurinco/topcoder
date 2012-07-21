/*
 * SRM528-D1-250
 * SOLVED
 */

import java.util.Arrays;

public class Cut {

	public int getMaximum(int[] eelLengths, int maxCuts) {
		int count = 0;

		Arrays.sort(eelLengths);

		for (int l : eelLengths)
			if (l % 10 == 0) {
				while (maxCuts > 0 && l > 10) {
					count++;
					maxCuts--;
					l -= 10;
				}
				if (l == 10)
					count++;
			}

		for (int l : eelLengths)
			if (l % 10 != 0) {
				while (maxCuts > 0 && l > 10) {
					count++;
					maxCuts--;
					l -= 10;
				}

				if (l == 10)
					count++;
			}

		return count;
	}

}
