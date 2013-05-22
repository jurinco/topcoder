/*
 * SRM466-D2-250
 * SOLVED
 */

public class LotteryTicket {

	public String buy(int price, int b1, int b2, int b3, int b4) {
		return possible(price, new int[] { b1, b2, b3, b4 }, 0) ? "POSSIBLE" : "IMPOSSIBLE";
	}

	private boolean possible(int price, int[] banknotes, int i) {
		if (price == 0)
			return true;

		if (price < 0 || i >= banknotes.length)
			return false;

		return possible(price, banknotes, i + 1) || possible(price - banknotes[i], banknotes, i + 1);
	}

}
