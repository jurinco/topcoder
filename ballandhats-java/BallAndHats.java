/*
 * SRM549-D2-250
 * SOLVED
 */

public class BallAndHats {

	public int getHat(String hats, int numSwaps) {
		if (numSwaps == 0)
			return hats.indexOf('o');

		return (hats.indexOf('o') + numSwaps) % 2;
	}

}
