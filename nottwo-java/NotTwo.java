/*
 * SRM452-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class NotTwo {

	public int maxStones(int width, int height) {
		if (width == 1)
			return line(height);

		int c = 0;
		for (int i = 0; i < height; ++i)
			c += line(width - (i & 2));

		return c;
	}

	private int line(int len) {
		return ((len / 4) * 2) + min(len % 4, 2);
	}

}
