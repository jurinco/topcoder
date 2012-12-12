/*
 * SRM563-D2-250
 * SOLVED
 */

public class FoxAndHandleEasy {

	public String isPossible(String S, String T) {
		for (int i = 0; i < S.length(); ++i)
			if (T.equals(S.substring(0, i) + S + S.substring(i)))
				return "Yes";

		return "No";
	}

}
