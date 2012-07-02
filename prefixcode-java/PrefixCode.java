/*
 * SRM151-D2-250
 * SOLVED
 */

public class PrefixCode {

	public String isOne(String[] words) {
		for (int i = 0; i < words.length; ++i)
			if (isPrefix(words[i], words))
				return "No, " + i;

		return "Yes";
	}

	private boolean isPrefix(String w, String[] words) {
		for (String full : words)
			if (full.startsWith(w) && !w.equals(full))
				return true;

		return false;
	}

}
