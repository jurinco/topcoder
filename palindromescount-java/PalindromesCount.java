/*
 * SRM474-D2-250
 * SOLVED
 */

public class PalindromesCount {

	public int count(String A, String B) {
		int c = 0;
		for (int i = 0; i <= A.length(); ++i)
			if (palindrome(A.substring(0, i) + B + A.substring(i)))
				c++;

		return c;
	}

	private boolean palindrome(String s) {
		for (int i = 0; i < s.length(); ++i)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;

		return true;
	}

}
