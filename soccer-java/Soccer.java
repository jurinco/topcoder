/*
 * SRM194-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class Soccer {

	public int maxPoints(int[] wins, int[] ties) {
		int m = wins[0] * 3 + ties[0];

		for (int i = 0; i < wins.length; i++)
			m = max(m, wins[i] * 3 + ties[i]);
		return m;
	}

}
