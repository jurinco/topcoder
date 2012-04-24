/*
 * SRM539-D1-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class Over9000Rocks {

	class IntPair implements Comparable<IntPair> {
		public int first;
		public int second;

		public IntPair(int first, int second) {
			this.first = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "{" + first + ", " + second + "}";
		}

		public int compareTo(IntPair p) {
			int r = first - p.first;
			return r == 0 ? second - p.second : r;
		}

		@Override
		public int hashCode() {
			return 13 * first + second;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;

			IntPair other = (IntPair) obj;
			return first == other.first && second == other.second;
		}

	}

	public int countPossibilities(int[] lowerBound, int[] upperBound) {
		TreeSet<IntPair> ranges = new TreeSet<IntPair>();

		ranges.add(new IntPair(0, 0));

		for (int i = 0; i < lowerBound.length; ++i)
			ranges = expandRanges(ranges, lowerBound[i], upperBound[i]);

		return count(ranges);
	}

	private int count(TreeSet<IntPair> ranges) {
		int c = 0;

		for (IntPair r : ranges)
			if (r.first > 9000) {
				c += r.second - r.first + 1;
			} else if (r.second > 9000) {
				c += r.second - 9000;
			}

		return c;
	}

	private TreeSet<IntPair> expandRanges(TreeSet<IntPair> oldRanges, int min, int max) {
		TreeSet<IntPair> ranges = new TreeSet<IntPair>();
		ranges.addAll(oldRanges);

		for (IntPair r : oldRanges)
			ranges.add(new IntPair(r.first + min, r.second + max));

		TreeSet<IntPair> newRanges = new TreeSet<IntPair>();

		IntPair cur = null;
		for (IntPair r : ranges) {
			if (cur == null) {
				cur = r;
			} else if (cur.second < r.first - 1) {
				newRanges.add(cur);
				cur = r;
			} else {
				cur.second = max(cur.second, r.second);
			}
		}

		newRanges.add(cur);

		return newRanges;
	}

}
