/*
 * SRM464-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class ColorfulBoxesAndBalls {

	public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
		int swapScore = 2 * bothColors;
		int sameScore = onlyRed + onlyBlue;

		int min = min(numRed, numBlue);

		if (sameScore > swapScore) {
			return sameScore * min + onlyRed * (numRed - min) + onlyBlue * (numBlue - min);
		} else {
			return swapScore * min + onlyRed * (numRed - min) + onlyBlue * (numBlue - min);
		}
	}

}
