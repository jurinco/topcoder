public class Boards {

	int[][] counterSums(String[] board, char c) {
		int w = board[0].length();
		int h = board.length;

		int[][] sums = new int[h][w];

		int rc = 0;
		for (int i = 0; i < w; ++i) {
			if (board[0].charAt(i) == c)
				rc++;

			sums[0][i] = rc;
		}

		for (int i = 1; i < h; ++i) {
			rc = 0;

			for (int j = 0; j < w; ++j) {
				if (board[i].charAt(j) == c)
					rc++;

				sums[i][j] = sums[i - 1][j] + rc;
			}
		}

		return sums;
	}

	int count(int[][] flows, int x1, int x2, int y1, int y2) {
		int count = flows[y2][x2];

		if (x1 > 0)
			count -= flows[y2][x1 - 1];

		if (y1 > 0)
			count -= flows[y1 - 1][x2];

		if (y1 > 0 && x1 > 0)
			count += flows[y1 - 1][x1 - 1];

		return count;
	}

}
