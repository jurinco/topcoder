/*
 * SRM465-D2-250
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class NumberNeighbours {

	public int numPairs(int[] numbers) {
		int c = 0;

		for (int i = 0; i < numbers.length; ++i)
			for (int j = i + 1; j < numbers.length; ++j)
				if (neighbor(numbers[i], numbers[j]))
					c++;
		return c;
	}

	private boolean neighbor(int n1, int n2) {
		char[] s1 = String.valueOf(n1).toCharArray();
		char[] s2 = String.valueOf(n2).toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < max(s1.length, s2.length); ++i)
			if (c(s1, i) != c(s2, i))
				return false;

		return true;
	}

	private Object c(char[] c, int i) {
		return i < c.length ? c[c.length - 1 - i] : '0';
	}

}
