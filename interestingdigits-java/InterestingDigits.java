/*
 * SRM150-D2-500
 * SOLVED
 */

import java.util.*;

public class InterestingDigits {

	public int[] digits(int base) {
		ArrayList<Integer> digits = new ArrayList<Integer>();

		for (int d = 2; d < base; ++d)
			if (isInteresting(d, base))
				digits.add(d);

		int[] digitsArr = new int[digits.size()];

		for (int i = 0; i < digitsArr.length; i++)
			digitsArr[i] = digits.get(i);

		return digitsArr;
	}

	private boolean isInteresting(int d, int base) {
		int mult = d * d;
		int lim = base * base * base * base * base;

		while (mult < lim) {
			if (sumDigits(mult, base) % d != 0)
				return false;

			mult = mult * d;
		}

		return true;
	}

	private int sumDigits(int n, int base) {
		int sum = 0;
		while (n > 0) {
			sum += n % base;
			n = n / base;
		}

		return sum;
	}

}
