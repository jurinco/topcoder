/*
 * SRM194-D2-500
 * SOLVED
 */

import java.util.*;

public class ThirtyOne {

	private static final HashMap<String, Integer> cardSums = new HashMap<String, Integer>();
	{
		cardSums.put("2", 2);
		cardSums.put("3", 3);
		cardSums.put("4", 4);
		cardSums.put("5", 5);
		cardSums.put("6", 6);
		cardSums.put("7", 7);
		cardSums.put("8", 8);
		cardSums.put("9", 9);
		cardSums.put("10", 10);
		cardSums.put("J", 10);
		cardSums.put("Q", 10);
		cardSums.put("K", 10);
	};

	public int findWinner(String[] hands) {
		TreeMap<Integer, Integer> firstWithSum = new TreeMap<Integer, Integer>();

		for (int i = 0; i < hands.length; ++i) {
			String[] cards = hands[i].split(" ");

			addSums(firstWithSum, i, cards, 0, 0);
		}

		if (firstWithSum.containsKey(0))
			return firstWithSum.get(0);

		for (int i = 0; i < hands.length; ++i) {
			String[] cards = hands[i].split(" ");
			if (cards[0].equals(cards[1]) && cards[0].equals(cards[2]))
				return i;
		}

		return firstWithSum.get(firstWithSum.firstKey());
	}

	private void addSums(TreeMap<Integer, Integer> firstWithSum, int i, String[] cards, int start, int sum) {
		if (start == cards.length) {
			if (sum <= 31 && !firstWithSum.containsKey(31 - sum))
				firstWithSum.put(31 - sum, i);
		} else {
			String card = cards[start];

			if (card.equals("A")) {
				addSums(firstWithSum, i, cards, start + 1, sum + 1);
				addSums(firstWithSum, i, cards, start + 1, sum + 11);
			} else {
				addSums(firstWithSum, i, cards, start + 1, sum + cardSums.get(card));
			}
		}

	}

}
