/*
 * SRM440-D1-500
 * SOLVED
 */

public class MazeWandering {

	int[] DX = { -1, 0, 1, 0 };
	int[] DY = { 0, -1, 0, 1 };

	public double expectedTime(String[] maze) {
		int w = maze[0].length();
		int h = maze.length;

		for (int y = 0; y < h; ++y)
			for (int x = 0; x < w; ++x)
				if (maze[y].charAt(x) == '*') {
					double[][] c = new double[h][w];

					dfsCoeff(maze, w, h, x, y, -1, -1, c);

					return dfsExpSum(maze, w, h, x, y, -1, -1, c, 0) / dfsCount(maze, w, h, x, y, -1, -1);
				}

		return 0;
	}

	private double dfsExpSum(String[] maze, int w, int h, int x, int y, int px, int py, double[][] c, double cur) {
		double sum = 0;

		for (int i = 0; i < 4; ++i) {
			int nx = x + DX[i];
			int ny = y + DY[i];

			if (nx >= 0 && nx < w && ny >= 0 && ny < h && maze[ny].charAt(nx) != 'X' && (nx != px || ny != py))
				sum += dfsExpSum(maze, w, h, nx, ny, x, y, c, c[ny][nx] + cur);
		}

		return cur + sum;
	}

	private int dfsCount(String[] maze, int w, int h, int x, int y, int px, int py) {
		int cnt = 1;

		for (int i = 0; i < 4; ++i) {
			int nx = x + DX[i];
			int ny = y + DY[i];

			if (nx >= 0 && nx < w && ny >= 0 && ny < h && maze[ny].charAt(nx) != 'X' && (nx != px || ny != py))
				cnt += dfsCount(maze, w, h, nx, ny, x, y);
		}

		return cnt;
	}

	private double dfsCoeff(String[] maze, int w, int h, int x, int y, int px, int py, double[][] c) {
		double cs = 0;

		for (int i = 0; i < 4; ++i) {
			int nx = x + DX[i];
			int ny = y + DY[i];

			if (nx >= 0 && nx < w && ny >= 0 && ny < h && maze[ny].charAt(nx) != 'X' && (nx != px || ny != py))
				cs += 1 + dfsCoeff(maze, w, h, nx, ny, x, y, c);
		}

		return c[y][x] = 1 + cs;
	}
}
