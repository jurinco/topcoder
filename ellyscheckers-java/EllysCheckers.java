/*
 * SRM534D1-250
 * SOLVED
 */

public class EllysCheckers {

	public String getWinner(String board) {
		int sum = 0;
		for (int i = 0; i < board.length() - 1; ++i)
			if (board.charAt(i) == 'o')
				sum += board.length() - 1 - i;

		return ((sum % 2) == 1) ? "YES" : "NO";
	}

}
