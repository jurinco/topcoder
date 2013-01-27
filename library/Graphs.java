import static java.lang.Math.min;

import java.util.BitSet;
import java.util.Map;

/**
 * dijkstra - minimal path floyd - all minimal paths kuhn
 */
public class Graphs {

	long INF = Long.MAX_VALUE >> 4;

	public boolean kuhn(int v, Map<Integer, Integer> marks, BitSet marked, boolean matrix[][]) {
		if (marked.get(v))
			return false;

		marked.set(v);

		for (int i = 0; i < matrix[v].length; ++i)
			if (matrix[v][i] && (!marks.containsKey(i) || kuhn(marks.get(i), marks, marked, matrix))) {
				marks.put(i, v);
				return true;
			}

		return false;
	}

	public long[][] floyd(String[] graph) {
		long[][] dist = new long[graph.length][graph.length];

		for (int i = 0; i < dist.length; i++)
			for (int j = 0; j < dist.length; j++)
				if (i == j)
					dist[i][j] = 0;
				else if (graph[i].charAt(j) == 'X')
					dist[i][j] = INF;
				else
					dist[i][j] = graph[i].charAt(j) - '0';

		for (int k = 0; k < graph.length; ++k)
			for (int i = 0; i < graph.length; i++)
				for (int j = 0; j < graph.length; j++)
					dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);

		return dist;
	}

	public long[] dijkstra(String[] graph, int from, int to) {
		long[] dist = new long[graph.length];
		boolean[] marked = new boolean[graph.length];

		dist[from] = 0;
		for (int i = 0; i < dist.length; i++)
			dist[i] = -1;

		while (true) {
			int u = -1;
			for (int i = 0; i < dist.length; i++)
				if (!marked[i] && dist[i] >= 0 && (u < 0 || dist[i] < dist[u]))
					u = i;

			if (u < 0)
				return dist;

			marked[u] = true;

			for (int i = 0; i < dist.length; i++)
				if (!marked[i] && graph[u].charAt(i) != 'X')
					if (dist[i] < 0 || dist[i] > dist[u] + (graph[u].charAt(i) - '0'))
						dist[i] = dist[u] + (graph[u].charAt(i) - '0');

		}
	}

}
