/*
 * SRM156-D2-250
 * SOLVED
 */

import java.util.*;

public class DiskSpace {

	public int minDrives(int[] used, int[] total) {
		int sum = arsum(used);
		Arrays.sort(total);

		int i = total.length - 1;

		while (i >= 0 && sum > 0)
			sum -= total[i--];

		return total.length - 1 - i;
	}

	private int arsum(int[] arr) {
		int sum = 0;
		for (int v : arr)
			sum += v;
		return sum;
	}

}
