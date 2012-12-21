/*
 * SRM453.5-D2-500
 * SRM453.5-D1-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class MazeMaker {

	public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
		int[][] dist = bfs(maze, startRow, startCol, moveRow, moveCol);

		int m = 0;

		for (int er = 0; er < maze.length; ++er)
			for (int ec = 0; ec < maze[0].length(); ++ec)
				if (maze[er].charAt(ec) == '.') {
					if (dist[er][ec] < 0)
						return -1;

					m = max(m, dist[er][ec]);
				}

		return m;
	}

	public int[][] bfs(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
		int[][] dist = new int[maze.length][maze[0].length()];

		for (int i = 0; i < dist.length; i++)
			for (int j = 0; j < dist[i].length; j++)
				dist[i][j] = -1;

		dist[startRow][startCol] = 0;

		LinkedList<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { startRow, startCol });

		while (!q.isEmpty()) {
			int[] p = q.poll();

			for (int i = 0; i < moveRow.length; ++i) {
				int r = p[0] + moveRow[i];
				int c = p[1] + moveCol[i];

				if (r >= 0 && r < maze.length && c >= 0 && c < maze[0].length() && dist[r][c] < 0 && maze[r].charAt(c) == '.') {
					dist[r][c] = dist[p[0]][p[1]] + 1;
					q.add(new int[] { r, c });
				}
			}
		}

		return dist;
	}
}
