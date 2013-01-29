/*
 * SRM567-D2-250
 * SOLVED
 */

public class NinjaTurtles {

	public int countOpponents(int P, int K) {
		for (int N = 1; N <= P * 4; ++N)
			if (P == 3 * (N / K) + (N / 3))
				return N;
		return -1;
	}

}
