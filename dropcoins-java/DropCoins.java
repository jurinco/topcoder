import static java.lang.Math.*;

public class DropCoins {

	public int getMinimum(String[] board, int K) {
		int w = board[0].length();
		int h = board.length;
		int[][] psums = new int[w][h];

		System.out.println("!!");

		for (int y = 0; y < h; ++y) {
			psums[0][y] = board[y].charAt(0) == 'o' ? 1 : 0;

			if (y != 0)
				psums[0][y] += psums[0][y - 1];

			for (int x = 1; x < w; ++x) {
				psums[x][y] = psums[x - 1][y]
						+ (board[y].charAt(x) == 'o' ? 1 : 0);

				if (y != 0)
					psums[x][y] += psums[x][y - 1] - psums[x - 1][y - 1];
			}
		}

		int min = 900;
		for (int sx = 0; sx < w; ++sx) {
			for (int ex = sx; ex < w; ++ex) {
				int mx = move(sx, ex, w);

				for (int sy = 0; sy < h; ++sy) {
					for (int ey = sy; ey < h; ++ey) {
						int my = move(sy, ey, h);

						int sum = psums[ex][ey];

						if (sx > 0)
							sum -= psums[sx - 1][ey];
						if (sy > 0)
							sum -= psums[ex][sy - 1];
						if (sx > 0 && sy > 0)
							sum += psums[sx - 1][sy - 1];

						if (sum == K)
							min = min(min, mx + my);
					}
				}
			}
		}

		return (min == 900) ? -1 : min;

	}

	private int move(int sx, int ex, int w) {
		if (sx == 0)
			return (w - 1 - ex);
		else if (ex == 0)
			return sx;
		else
			return min(2 * sx + (w - 1 - ex), 2 * (w - 1 - ex) + sx);
	}

}
