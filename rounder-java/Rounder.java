/*
 * SRM195-D2-250
 * SOLVED
 */

public class Rounder {

	public int round(int n, int b) {
		if (b - n % b <= n % b)
			return n - n % b + b;
		else
			return n - n % b;
	}

}
