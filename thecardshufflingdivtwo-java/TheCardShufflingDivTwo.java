/*
 * SRM448-D2-500
 * SOLVED
 */

public class TheCardShufflingDivTwo {

	public int shuffle(int n, int m) {
		int c = 1;

		for (int i = 0; i < m; ++i) {
			if (c <= n / 2) {
				c = c * 2;
			} else {
				c = (c - n / 2) * 2 - 1;
			}
		}

		return c;
	}

}
