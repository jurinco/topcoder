/*
 * SRM448-D2-250
 * SOLVED
 */

public class TheBlackJackDivTwo {

	public int score(String[] cards) {
		int score = 0;

		for (String c : cards) {
			if (c.charAt(0) == 'T' || c.charAt(0) == 'J' || c.charAt(0) == 'Q' || c.charAt(0) == 'K')
				score += 10;
			else if (c.charAt(0) == 'A')
				score += 11;
			else
				score += c.charAt(0) - '0';

		}

		return score;
	}

}
