import java.util.LinkedList;

/**
 * bfs - BFS search in maze, with specific valid moves, returns distance matrix
 */
public class Mazes {

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
