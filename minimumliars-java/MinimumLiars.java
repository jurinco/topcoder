/*
 * TCO11-1A-250
 * SOLVED
 */

public class MinimumLiars {

	public int getMinimum(int[] claim) {
		for (int l = 0; l <= claim.length; ++l)
			if (liars(claim, l) == l)
				return l;

		return -1;
	}

	private int liars(int[] claim, int l) {
		int count = 0;

		for (int c : claim)
			if (c > l)
				count++;

		return count;
	}

}
