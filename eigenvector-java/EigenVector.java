/*
 * SRM192-D2-1000
 * SOLVED
 */

import static java.lang.Math.*;

public class EigenVector {

	static int MN = 9;

	public int[] findEigenVector(String[] A) {
		int[][] m = new int[A.length][A.length];

		for (int i = 0; i < m.length; i++) {
			String[] parts = A[i].split(" ");

			for (int j = 0; j < m[i].length; j++)
				m[i][j] = Integer.valueOf(parts[j]);
		}

		int[] v = new int[A.length];

		findVector(v, m, 0, MN);

		return v;
	}

	private boolean findVector(int[] v, int[][] m, int i, int n) {
		if (i == v.length)
			return n < MN && isEigen(v, m);

		if (n == MN) {
			for (int k = 0; k <= n; ++k) {
				v[i] = k;

				if (findVector(v, m, i + 1, n - k))
					return true;
			}
		} else {
			for (int k = -n; k <= n; ++k) {
				v[i] = k;

				if (findVector(v, m, i + 1, n - abs(k)))
					return true;
			}
		}

		return false;
	}

	private boolean isEigen(int[] v, int[][] m) {
		int[] rv = new int[v.length];

		for (int i = 0; i < rv.length; i++) {
			int r = 0;

			for (int j = 0; j < v.length; j++)
				r += v[j] * m[i][j];

			rv[i] = r;
		}
		return isProp(v, rv);
	}

	private boolean isProp(int[] v, int[] rv) {
		double k = 0.0;

		for (int i = 0; i < v.length; ++i) {
			if ((v[i] == 0) != (rv[i] == 0))
				return false;

			if (v[i] != 0) {
				double ck = rv[i] * 1.0 / v[i];

				if (abs(k) < 1e-9 || abs(k - ck) < 1e-9)
					k = ck;
				else
					return false;
			}
		}

		return true;
	}

}
