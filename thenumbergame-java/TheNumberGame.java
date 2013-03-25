/*
 * SRM574-D1-275
 * SOLVED
 */

public class TheNumberGame {

	public String determineOutcome(int A, int B) {
		String ad = String.valueOf(A);
		String bd = String.valueOf(B);

		if (ad.contains(bd) || reverse(ad).contains(bd))
			return "Manao wins";
		else
			return "Manao loses";
	}

	private String reverse(String ad) {
		char[] chars = ad.toCharArray();
		char[] nchars = new char[chars.length];

		for (int i = 0; i < chars.length; ++i)
			nchars[i] = chars[chars.length - i - 1];

		return new String(nchars);
	}

}
