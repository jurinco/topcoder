/*
 * SRM563-D2-550
 * SOLVED
 */

import static java.lang.Math.*;

public class CoinsGameEasy {

	int INF = 100000;

	public int minimalSteps(String[] board) {
		int[][] coins = detectCoins(board);
		int steps = minSteps(board, coins, 10);

		return steps == INF ? -1 : steps;
	}

	private int minSteps(String[] board, int[][] coins, int lim) {
		if (in(board, coins[0]) != in(board, coins[1]))
			return 0;

		if (lim <= 0)
			return INF;

		int m = INF;
		m = min(m, 1 + minSteps(board, move(board, coins, 0, -1), lim - 1));
		m = min(m, 1 + minSteps(board, move(board, coins, 0, 1), lim - 1));
		m = min(m, 1 + minSteps(board, move(board, coins, -1, 0), lim - 1));
		m = min(m, 1 + minSteps(board, move(board, coins, 1, 0), lim - 1));

		return m;
	}

	private int[][] move(String[] board, int[][] coins, int i, int j) {
		return new int[][] { move(board, coins[0], i, j), move(board, coins[1], i, j) };
	}

	private int[] move(String[] board, int[] coin, int dr, int dc) {
		if (!in(board, coin))
			return coin;

		int[] newcoin = { coin[0] + dr, coin[1] + dc };

		if (in(board, newcoin) && board[newcoin[0]].charAt(newcoin[1]) == '#')
			return coin;

		return newcoin;
	}

	private boolean in(String[] board, int[] coin) {
		return coin[0] >= 0 && coin[0] < board.length && coin[1] >= 0 && coin[1] < board[0].length();
	}

	private int[][] detectCoins(String[] board) {
		int[][] coins = new int[2][2];
		int coinIndex = 0;

		int w = board[0].length();
		int h = board.length;

		for (int y = 0; y < h; ++y) {
			String row = board[y];

			for (int x = 0; x < w; ++x) {
				if (row.charAt(x) == 'o') {
					coins[coinIndex][0] = y;
					coins[coinIndex][1] = x;
					coinIndex++;
				}
			}
		}
		return coins;
	}

}
