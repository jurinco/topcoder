/*
 * SRM571-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FoxAndMp3 {

	public String[] playList(int n) {
		int count = min(n, 50);
		String[] res = new String[count];

		long ln = n;
		long c = 1;
		for (int i = 0; i < count; ++i) {
			res[i] = c + ".mp3";

			if (c * 10 <= ln) {
				c *= 10;
			} else if (c % 10 < 9 && c < ln) {
				c++;
			} else {
				c = c / 10 + 1;
			}
		}

		return res;
	}

}
