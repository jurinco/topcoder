/*
 * SRM148-D2-250
 * UNSOLVED
 */

public class DivisorDigits {

	public int howMany(int number) {
		int rem = number;
		int count = 0;

		while (rem > 0) {
			int d = rem % 10;
			rem = rem / 10;

			if (d > 0 && number % d == 0)
				count++;
		}

		return count;
	}

}
