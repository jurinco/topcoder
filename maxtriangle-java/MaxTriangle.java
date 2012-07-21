/*
 * SRM449-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class MaxTriangle {

	public double calculateArea(int A, int B) {
		int max = 0;

		for (int x1 = 0, x1m = (int) sqrt(A); x1 <= x1m; ++x1) {
			int y1 = (int) sqrt(A - x1 * x1);

			if (x1 * x1 + y1 * y1 == A) {
				for (int x2 = 0, x2m = (int) sqrt(B); x2 <= x2m; ++x2) {
					int y2 = (int) sqrt(B - x2 * x2);

					if (x2 * x2 + y2 * y2 == B)
						max = max(max, x1 * y2 + x2 * y1);
				}
			}
		}

		return max == 0 ? -1 : 0.5 * max;
	}

}
