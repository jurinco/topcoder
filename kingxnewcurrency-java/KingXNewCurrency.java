/*
 * SRM537-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class KingXNewCurrency {

	public int howMany(int A, int B, int X) {
		if (A % X == 0 && B % X == 0)
			return -1;

		int count = 0;

		for (int Y = 1; Y <= max(A, B); ++Y)
			if (suits(A, X, Y) && suits(B, X, Y))
				count++;

		return count;
	}

	private boolean suits(int A, int X, int Y) {
		for (int N = A; N >= 0; N -= X)
			if (N % Y == 0)
				return true;

		return false;
	}

}
