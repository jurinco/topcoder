/*
 * SRM155-D2-250
 * SOLVED
 */

public class Quipu {

	public int readKnots(String knots) {
		int res = 0;

		for (int i = 1, l = 0; i < knots.length(); ++i)
			if (knots.charAt(i) == '-') {
				res = res * 10 + (i - l - 1);
				l = i;
			}

		return res;
	}

}
