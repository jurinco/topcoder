/*
 * SRM158-D2-500
 * SOLVED
 */

public class BaseMystery {

	public int[] getBase(String equation) {
		String[] parts = equation.split("[=+]");

		int[] results = new int[100];
		int count = 0;

		for (int i = 2; i <= 20; ++i)
			if (valid(parts, i))
				results[count++] = i;

		int[] res = new int[count];
		System.arraycopy(results, 0, res, 0, count);
		return res;
	}

	private boolean valid(String[] parts, int b) {
		try {
			return Integer.valueOf(parts[0], b) + Integer.valueOf(parts[1], b) == Integer.valueOf(parts[2], b);
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
