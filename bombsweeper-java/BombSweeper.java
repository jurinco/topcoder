/*
 * SRM156-D2-600
 * SOLVED
 */

import static java.lang.Math.*;

public class BombSweeper {

	public double winPercentage(String[] board) {
		int wins = 0;
		int loses = 0;

		int w = board[0].length();
		int h = board.length;

		for (int y = 0; y < h; ++y) {
			String row = board[y];

			for (int x = 0; x < w; ++x) {
				if (row.charAt(x) == 'B')
					loses++;
				else if (isWin(board, x, y))
					wins++;

			}
		}

		return wins * 100.0 / (wins + loses);
	}

	private boolean isWin(String[] board, int x, int y) {
		for (int j = max(y - 1, 0); j <= min(y + 1, board.length - 1); ++j)
			for (int i = max(x - 1, 0); i <= min(x + 1, board[j].length() - 1); ++i)
				if (board[j].charAt(i) == 'B')
					return false;

		return true;
	}

}
