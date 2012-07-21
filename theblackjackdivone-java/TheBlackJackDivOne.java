/*
 * SRM448-D1-250
 * SOLVED
 */

public class TheBlackJackDivOne {

	public double expected(String[] cards) {
		int sum = 0;
		int[] deck = new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 16, 4 };
		int deckSize = 52;

		for (String c : cards) {
			int sc = cardScore(c.charAt(0));

			sum += sc;
			deck[sc - 2]--;
			deckSize--;
		}

		return expected(sum, cards.length, deck, deckSize) - cards.length;
	}

	private double expected(int sum, int count, int[] deck, int deckSize) {
		if (sum >= 21)
			return count;

		double exp = 0;

		for (int sc = 2; sc <= 11; ++sc)
			if (deck[sc - 2] > 0) {
				double prob = deck[sc - 2] * 1.0 / deckSize;

				deck[sc - 2]--;
				deckSize--;

				exp += prob * expected(sum + sc, count + 1, deck, deckSize);

				deck[sc - 2]++;
				deckSize++;
			}

		return exp;
	}

	private int cardScore(char c) {
		if (c == 'A')
			return 11;
		else if (c >= '0' && c <= '9')
			return c - '0';
		else
			return 10;
	}

}
