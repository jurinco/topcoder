public class TreeBoards {

	static int[] DX = { -1, 0, 1, 0 };
	static int[] DY = { 0, -1, 0, 1 };

	static int dfsCount(String[] maze, int w, int h, int x, int y, int px, int py) {
		int cnt = 1;

		for (int i = 0; i < 4; ++i) {
			int nx = x + DX[i];
			int ny = y + DY[i];

			if (nx >= 0 && nx < w && ny >= 0 && ny < h && maze[ny].charAt(nx) != 'X' && (nx != px || ny != py))
				cnt += dfsCount(maze, w, h, nx, ny, x, y);
		}

		return cnt;
	}

}
