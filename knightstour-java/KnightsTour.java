/*
 * SRM477-D2-500
 * SOLVED
 */

public class KnightsTour {

	int[] MX = { -1, -1, 1, 1, -2, -2, 2, 2 };
	int[] MY = { -2, 2, -2, 2, -1, 1, -1, 1 };

	public int visitedPositions(String[] board) {
		int w = board[0].length();
		int h = board.length;

		char[][] m = new char[h][w];
		int kx = -1, ky = -1;

		for (int y = 0; y < h; ++y)
			for (int x = 0; x < w; ++x) {
				m[y][x] = board[y].charAt(x);

				if (m[y][x] == 'K') {
					kx = x;
					ky = y;
				}
			}

		m[ky][kx] = '*';

		int count = 1;
		while (true) {
			int[] next = select(ky, kx, m);

			if (next == null)
				break;

			ky = next[0];
			kx = next[1];
			m[ky][kx] = '*';
			count++;
		}

		return count;
	}

	private int[] select(int ky, int kx, char[][] m) {
		int[] min = null;

		for (int i = 0; i < MX.length; ++i) {
			int y = ky + MY[i];
			int x = kx + MX[i];

			if (valid(y, x, m)) {
				int acc = accessible(y, x, m);

				if (min == null || acc < min[2] || (acc == min[2] && y < min[0]) || (acc == min[2] && y == min[0] && x < min[1]))
					min = new int[] { y, x, acc };
			}
		}

		return min;
	}

	private int accessible(int y, int x, char[][] m) {
		int c = 0;

		for (int i = 0; i < MX.length; ++i)
			if (valid(y + MY[i], x + MX[i], m))
				c++;

		return c;
	}

	private boolean valid(int y, int x, char[][] m) {
		return y >= 0 && x >= 0 && y < m.length && x < m[y].length && m[y][x] == '.';
	}

}
