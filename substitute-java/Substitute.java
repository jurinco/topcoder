/*
 * SRM160-D2-250
 * SOLVED
 */

public class Substitute {

	public int getValue(String key, String code) {
		int res = 0;

		for (char c : code.toCharArray()) {
			int d = key.indexOf(c);

			if (d >= 0)
				res = res * 10 + (d + 1) % 10;
		}

		return res;
	}

}
