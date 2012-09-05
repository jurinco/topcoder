/*
 * SRM158-D2-1000
 * SOLVED
 */

public class Gems {

	public int numMoves(String[] board) {
		int w = board[0].length();
		int h = board.length;
		int c = 0;

		for (int y = 0; y < h; ++y)
			for (int x = 1; x < w; ++x)
				if (valid(board, w, h, x, y, x - 1, y))
					c++;

		for (int y = 1; y < h; ++y)
			for (int x = 0; x < w; ++x)
				if (valid(board, w, h, x, y, x, y - 1))
					c++;

		return c;
	}

	private boolean valid(String[] board, int w, int h, int ox, int oy, int nx, int ny) {
		if (board[ny].charAt(nx) == board[oy].charAt(ox))
			return false;

		return valid(board, w, h, ox, oy, nx, ny, nx, ny, board[oy].charAt(ox)) || valid(board, w, h, ox, oy, nx, ny, ox, oy, board[ny].charAt(nx));
	}

	private boolean valid(String[] board, int w, int h, int ox, int oy, int nx, int ny, int sx, int sy, char c) {
		int ch = 1;
		int cv = 1;

		for (int x = sx + 1; ch < 3 && x < w && val(board, ox, oy, nx, ny, x, sy) == c; ++x)
			ch++;

		for (int x = sx - 1; ch < 3 && x >= 0 && val(board, ox, oy, nx, ny, x, sy) == c; --x)
			ch++;

		for (int y = sy + 1; cv < 3 && y < h && val(board, ox, oy, nx, ny, sx, y) == c; ++y)
			cv++;

		for (int y = sy - 1; cv < 3 && y >= 0 && val(board, ox, oy, nx, ny, sx, y) == c; --y)
			cv++;

		return ch >= 3 || cv >= 3;
	}

	private char val(String[] board, int ox, int oy, int nx, int ny, int x, int y) {
		if (x == nx && y == ny)
			return board[oy].charAt(ox);
		if (x == ox && y == oy)
			return board[ny].charAt(nx);

		return board[y].charAt(x);
	}

}
