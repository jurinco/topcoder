/*
 * SRM536-D2-1000
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class MergersDivTwo {

	public double findMaximum(int[] revenues, int k) {
		Arrays.sort(revenues);

		double maxxs[] = new double[revenues.length + 1];

		maxxs[0] = Double.NEGATIVE_INFINITY;
		maxxs[1] = revenues[0];
		for (int n = 2; n < k; ++n)
			maxxs[n] = Double.NEGATIVE_INFINITY;
		for (int n = k; n <= revenues.length; ++n) {
			double m = Double.NEGATIVE_INFINITY;

			for (int i = k; i <= n; ++i)
				m = max(m, (maxxs[n - i + 1] + sum(revenues, n - i + 1, n)) / i);

			maxxs[n] = m;
		}

		return maxxs[revenues.length];
	}

	private int sum(int[] revenues, int f, int t) {
		int s = 0;

		for (int i = f; i < t; ++i)
			s += revenues[i];

		return s;
	}

}
