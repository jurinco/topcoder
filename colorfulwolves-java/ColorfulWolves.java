/*
 * SRM551-D1-450
 * SOLVED
 */

import java.util.*;

public class ColorfulWolves {

	class Pos implements Comparable<Pos> {
		public int changes, pos;

		public Pos(int first, int second) {
			this.changes = first;
			this.pos = second;
		}

		public int compareTo(Pos p) {
			int r = changes - p.changes;
			return r == 0 ? pos - p.pos : r;
		}

		@Override
		public int hashCode() {
			return 13 * changes + pos;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;

			Pos other = (Pos) obj;
			return changes == other.changes && pos == other.pos;
		}

	}

	public int getmin(String[] colormap) {
		BitSet marked = new BitSet(colormap.length);
		PriorityQueue<Pos> q = new PriorityQueue<Pos>();

		q.add(new Pos(0, 0));

		while (!q.isEmpty()) {
			Pos cur = q.poll();

			if (cur.pos == colormap.length - 1)
				return cur.changes;

			if (marked.get(cur.pos))
				continue;

			marked.set(cur.pos);

			int changes = cur.changes;
			for (int i = 0; i < colormap.length; ++i)
				if (colormap[cur.pos].charAt(i) == 'Y')
					q.add(new Pos(changes++, i));
		}

		return -1;
	}

}
