/*
 * SRM463-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class BunnyPuzzle {

	public int theCount(int[] bunnies) {
		int c = 0;
		for (int a = 0; a < bunnies.length; a++) {
			for (int b = 0; b < bunnies.length; b++) {
				if (a == b)
					continue;

				int ao = bunnies[a];
				int an = bunnies[b] * 2 - bunnies[a];

				if (in(min(ao, an), max(ao, an), bunnies) > 2)
					continue;

				c++;
			}
		}

		return c;
	}

	private int in(int min, int max, int[] bunnies) {
		int c = 0;
		for (int b : bunnies)
			if (b >= min && b <= max)
				c++;

		return c;
	}

}
