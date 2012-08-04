/*
 * SRM522-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class PointErasingTwo {

	public int getMaximum(int[] y) {
		int m = 0;

		for (int i = 0; i < y.length; ++i)
			for (int j = i + 2; j < y.length; ++j)
				m = max(m, count(y, i, j));

		return m;
	}

	private int count(int[] y, int b, int e) {
		int c = 0;

		for (int i = b + 1; i < e; ++i)
			if (y[i] < y[b] && y[i] > y[e] || y[i] > y[b] && y[i] < y[e])
				c++;

		return c;
	}

}
