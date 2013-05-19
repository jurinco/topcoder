/*
 * SRM574-D2-500
 * SOLVED
 */

public class TheNumberGameDiv2 {

	public int minimumMoves(int A, int B) {
		String as = String.valueOf(A);
		String bs = String.valueOf(B);

		int l = as.length() - bs.length();

		if (as.indexOf(bs) == 0) {
			return l;
		} else if (as.contains(reverse(bs))) {
			return 1 + l;
		} else if (as.contains(bs)) {
			return 2 + l;
		} else
			return -1;
	}

	private String reverse(String s) {
		char[] chars = new char[s.length()];
		for (int i = 0; i < chars.length; ++i)
			chars[i] = s.charAt(s.length() - 1 - i);
		return new String(chars);
	}

}
