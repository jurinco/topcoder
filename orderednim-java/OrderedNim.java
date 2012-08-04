/*
 * SRM450-D2-500
 * SRM450-D1-250
 * SOLVED
 */

public class OrderedNim {

	String[] NAMES = new String[] { "Alice", "Bob" };

	public String winner(int[] layout) {
		return NAMES[winner(layout, 0, 0)];
	}

	private int winner(int[] layout, int empty, int cur) {
		if (layout.length - empty == 1)
			return cur;

		if (layout[empty] == 1)
			return winner(layout, empty + 1, 1 - cur);

		return cur;
	}

}
