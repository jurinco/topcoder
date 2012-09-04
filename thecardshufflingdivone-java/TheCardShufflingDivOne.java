/*
 * SRM448-D1-500
 * SOLVED
 */

public class TheCardShufflingDivOne {

	public int shuffle(int n, int left, int right) {
		int i, s;

		if (n % 2 == 1) {
			i = 1;
			s = 1;
		} else {
			i = 2;
			s = 2;
		}

		while (s < n) {
			int r = (s + 2) / 2;
			int l = (s + 3) / 2;

			if (i <= s / 2) { // from right deck
				i = i - 1 - right;

				while (i < 0)
					i += r;

				i = (i % r) * 2 + 2;
			} else { // from left deck
				i = i - r - left;

				while (i < 0)
					i += l;

				i = (i % l) * 2 + 1;
			}

			s += 2;
		}

		return i;
	}

}
