/*
 * SRM173-D1-250
 * SOLVED
 */

public class WordForm {

	public String getSequence(String word) {
		StringBuilder b = new StringBuilder();

		boolean first = true;
		boolean vowel = false;
		boolean consolt = false;
		for (char c : word.toUpperCase().toCharArray()) {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || (c == 'Y' && !first && !vowel)) {
				if (!vowel)
					b.append('V');
				vowel = true;
				consolt = false;
			} else {
				if (!consolt)
					b.append('C');
				vowel = false;
				consolt = true;
			}
			first = false;
		}

		return b.toString();
	}

}
