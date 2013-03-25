/*
 * SRM470-D2-250
 * SOLVED
 */

import java.util.*;

public class LinearTravellingSalesman {

	public int findMinimumDistance(int[] x, int[] y) {
		Arrays.sort(x);
		Arrays.sort(y);

		return x[x.length - 1] - x[0] + y[y.length - 1] - y[0];
	}

}
