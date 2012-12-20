/*
 * SRM454-D2-500
 * SOLVED
 */

public class WordsGame {

	public int minimumSwaps(String[] grid, String word) {
		int m = -1;

		for (int i = 0; i < word.length(); ++i) {
			int hm = swaps(grid[i], word);

			if (m < 0 || hm >= 0 && hm < m)
				m = hm;

			int vm = swaps(column(grid, i), word);

			if (m < 0 || vm >= 0 && vm < m)
				m = vm;
		}

		return m;
	}

	private String column(String[] grid, int i) {
		StringBuilder b = new StringBuilder();

		for (String row : grid)
			b.append(row.charAt(i));

		return b.toString();
	}

	private int swaps(String now, String target) {
		if (target.length() == 0)
			return 0;

		char tc = target.charAt(0);
		char nc = now.charAt(0);

		if (tc == nc)
			return swaps(now.substring(1), target.substring(1));

		int m = -1;
		for (int i = 0; i < target.length(); ++i)
			if (tc == now.charAt(i)) {
				int cm = swaps(tc + now.substring(1, i) + nc + now.substring(i + 1), target);

				if (m < 0 || cm >= 0 && cm < m)
					m = cm;
			}

		return m < 0 ? m : m + 1;
	}

}
