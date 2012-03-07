/*
 * SRM536D2-250
 * SOLVED
 */

public class BinaryPolynomialDivTwo {

	public int countRoots(int[] a) {
		int s = 0;
		for (int v : a)
			s += v;
		return (1 - (s % 2)) + (1 - a[0]);
	}

}
