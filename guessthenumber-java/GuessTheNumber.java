/*
 * SRM157-D2-250
 * SOLVED
 */

public class GuessTheNumber {

	public int noGuesses(int upper, int answer) {
		int n = 0;
		int l = 1, h = upper;
		while (true) {
			int x = (l + h) / 2;

			n++;

			if (x == answer)
				return n;
			if (x > answer)
				h = x - 1;
			if (x < answer)
				l = x + 1;
		}
	}

}
