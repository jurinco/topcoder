/*
 * SRM176-D1-250
 * SOLVED
 */

public class Matching {

	private static final String[][] features = new String[][] { new String[] { "CIRCLE", "SQUIGGLE", "DIAMOND" }, new String[] { "RED", "BLUE", "GREEN" },
			new String[] { "SOLID", "STRIPED", "EMPTY" }, new String[] { "ONE", "TWO", "THREE" } };

	private String findMatch(String first, String second, int feature) {
		if (first.equals(second))
			return first;
		else
			for (String s : features[feature])
				if (!s.equals(first) && !s.equals(second))
					return s;

		return null;
	}

	public String[] findMatch(String[] first, String[] second) {
		String[] res = new String[4];

		for (int i = 0; i < 4; ++i) {
			res[i] = findMatch(first[i], second[i], i);
		}

		return res;
	}

}
