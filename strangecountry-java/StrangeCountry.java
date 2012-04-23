/*
 * SRM441-D1-500
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class StrangeCountry {

	public int transform(String[] g) {
		if (countEdges(g) < g.length - 1)
			return -1;

		GraphComponentStats stats = new GraphComponentStats(g);

		if (stats.minSize <= 1)
			return -1;

		return stats.count - 1;
	}

	private int countEdges(String[] g) {
		int count = 0;
		for (int i = 0; i < g.length; ++i)
			for (int j = i; j < g.length; ++j)
				if (g[i].charAt(j) == 'Y')
					count++;

		return count;
	}

	private static class GraphComponentStats {
		public int count;
		public int minSize;
		public int maxSize;

		public GraphComponentStats(String[] g) {
			count = 0;
			minSize = 100000;
			maxSize = 0;

			BitSet marks = new BitSet(g.length);

			for (int i = 0; i < g.length; ++i)
				if (!marks.get(i))
					add(markDfs(i, g, marks));
		}

		private void add(int size) {
			count++;
			minSize = min(minSize, size);
			maxSize = max(maxSize, size);
		}

		private static int markDfs(int s, String[] g, BitSet marks) {
			marks.set(s);

			int count = 1;
			for (int i = 0; i < g.length; ++i)
				if (!marks.get(i) && g[s].charAt(i) == 'Y')
					count += markDfs(i, g, marks);

			return count;
		}
	}

}
