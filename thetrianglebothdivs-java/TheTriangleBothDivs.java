/*
 * SRM457-D2-500
 * SOLVED
 */

public class TheTriangleBothDivs {

	public String fix(String time) {
		char minh = time.charAt(3);
		char minl = time.charAt(4);

		if (minh == '?')
			minh = '0';

		if (minl == '?')
			minl = '0';

		return minSign(time, minh, minl);
	}

	private String minSign(String time, char minh, char minl) {
		if (time.charAt(9) == '-')
			return minZone(time, minh, minl, -1);
		if (time.charAt(9) == '+')
			return minZone(time, minh, minl, +1);

		return min(minZone(time, minh, minl, -1), minZone(time, minh, minl, +1));
	}

	private String minZone(String time, char minh, char minl, int sign) {
		if (time.charAt(10) != '?')
			return minHours(time, minh, minl, (time.charAt(10) - '0') * sign);

		String r = null;
		if (sign > 0)
			r = minHours(time, minh, minl, 0);

		for (int i = 1; i <= 9; ++i)
			r = min(r, minHours(time, minh, minl, i * sign));

		return r;
	}

	private String min(String a, String b) {
		if (a == null || a.compareTo(b) > 0)
			return b;

		return a;
	}

	private String minHours(String time, char minh, char minl, int i) {
		String r = null;

		for (int h = 0; h < 24; ++h)
			if ((time.charAt(0) == '?' || time.charAt(0) - '0' == h / 10) && (time.charAt(1) == '?' || time.charAt(1) - '0' == h % 10)) {
				int zh = (24 + h - i) % 24;

				r = min(r, "" + dig(zh / 10) + "" + dig(zh % 10) + ":" + minh + minl);
			}

		return r;
	}

	private char dig(int x) {
		return (char) ('0' + x);
	}

}
