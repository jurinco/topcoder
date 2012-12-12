/*
 * SRM463-D2-500
 * SRM463-D1-250
 * SOLVED
 */

import java.util.*;

public class RabbitNumbering {

	long M = 1000000007;

	public int theCount(int[] maxNumber) {
		Arrays.sort(maxNumber);

		long c = 1;

		for (int i = 0; i < maxNumber.length; ++i)
			c = (c * (maxNumber[i] - i)) % M;

		return (int) c;
	}

}
