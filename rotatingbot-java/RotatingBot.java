/*
 * SRM550-D1-300
 * SOLVED
 * UGLY
 */

import java.util.*;
import static java.lang.Math.*;

public class RotatingBot {

	class IntPair implements Comparable<IntPair> {
		public int x;
		public int y;

		public IntPair(int first, int second) {
			this.x = first;
			this.y = second;
		}

		@Override
		public String toString() {
			return "{" + x + ", " + y + "}";
		}

		public int compareTo(IntPair p) {
			int r = x - p.x;
			return r == 0 ? y - p.y : r;
		}

		@Override
		public int hashCode() {
			return 13 * x + y;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;

			IntPair other = (IntPair) obj;
			return x == other.x && y == other.y;
		}

	}

	public int minArea(int[] moves) {
		HashSet<IntPair> marked = new HashSet<IntPair>();
		HashMap<IntPair, IntPair> rots = new HashMap<RotatingBot.IntPair, RotatingBot.IntPair>();

		int dirx = 1;
		int diry = 0;
		int x = 0, y = 0;

		marked.add(new IntPair(x, y));

		for (int j = 0; j < moves.length; ++j) {
			int m = moves[j];

			for (int i = 0; i < m; ++i) {

				x += dirx;
				y += diry;

				if (!marked.add(new IntPair(x, y)))
					return -1;
			}

			if (j < moves.length - 1 && !marked.contains(new IntPair(x + dirx, y + diry)))
				rots.put(new IntPair(x, y), new IntPair(dirx, diry));

			if (dirx == 1 && diry == 0) {
				dirx = 0;
				diry = -1;
			} else if (dirx == 0 && diry == -1) {
				dirx = -1;
				diry = 0;
			} else if (dirx == -1 && diry == 0) {
				dirx = 0;
				diry = 1;
			} else if (dirx == 0 && diry == 1) {
				dirx = 1;
				diry = 0;
			} else {
				throw new Error(dirx + " " + diry);
			}
		}

		int minx = 1000;
		int maxx = -1000;
		int miny = 1000;
		int maxy = -1000;

		for (IntPair p : marked) {
			minx = min(minx, p.x);
			maxx = max(maxx, p.x);
			miny = min(miny, p.y);
			maxy = max(maxy, p.y);
		}

		for (Map.Entry<IntPair, IntPair> e : rots.entrySet()) {
			int nx = e.getKey().x + e.getValue().x;
			int ny = e.getKey().y + e.getValue().y;

			if (nx >= minx && nx <= maxx && ny >= miny && ny <= maxy)
				return -1;
		}

		return (maxx - minx + 1) * (maxy - miny + 1);
	}
}
