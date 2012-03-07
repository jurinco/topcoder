/*
 * SRM536D1-250
 * SOLVED
 */

import java.util.*;

public class MergersDivOne {

	public double findMaximum(int[] revenues) {
		Arrays.sort(revenues);

		double rev = revenues[0];

		for (int i = 1; i < revenues.length; ++i)
			rev = (rev + revenues[i]) / 2;

		return rev;
	}

}
