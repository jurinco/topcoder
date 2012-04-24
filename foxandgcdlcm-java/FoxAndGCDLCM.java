/*
 * SRM535-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FoxAndGCDLCM {

	public long get(long G, long L) {
		if (G < 0 || L < 0 || G == 0 || L % G != 0)
			return -1;

		long A = L / G;

		for (int st = (int) sqrt(A); st >= 1; --st)
			if (A % st == 0 && gcd(st, A / st) == 1) {
				System.out.println(st * G + " " + (A / st) * G);
				return (st * G + (A / st) * G);
			}

		return -1;
	}

	private long gcd(long A, long B) {
		while (A > 0) {
			long n = A;
			A = B % A;
			B = n;
		}

		return B;
	}

}
