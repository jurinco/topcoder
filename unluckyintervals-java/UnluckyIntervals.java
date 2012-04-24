/*
 * SRM438-D1-300
 * SOLVED
 * UGLY
 */

import java.util.*;
import static java.lang.Math.*;

public class UnluckyIntervals {

	static long INF = 1L << 60;

	class Num implements Comparable<Num> {
		public long unluck;
		public int second;

		public Num(long first, int second) {
			this.unluck = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "{" + unluck + ", " + second + "}";
		}

		public int compareTo(Num p) {
			if (unluck < p.unluck)
				return -1;
			if (unluck > p.unluck)
				return 1;

			return second - p.second;
		}

		@Override
		public int hashCode() {
			return 13 * (int) unluck + second;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;

			Num other = (Num) obj;
			return unluck == other.unluck && second == other.second;
		}

	}

	public int[] getLuckiest(int[] luckySet, int k) {
		Arrays.sort(luckySet);

		TreeSet<Num> luckiest = new TreeSet<Num>();

		for (int i = 0; i < luckySet.length; ++i) {
			int n = luckySet[i];
			int p = i == 0 ? 0 : luckySet[i - 1];

			for (int c = p + 1; c < min(p + k + 1, n); ++c)
				luckiest.add(new Num((n - c) * (long) (c - p) - 1, c));

			luckiest.add(new Num(0, n));

			for (int c = max(n - k - 1, p + 1); c < n; ++c)
				luckiest.add(new Num((n - c) * (long) (c - p) - 1, c));
		}

		for (int c = luckySet[luckySet.length - 1] + 1; c < luckySet[luckySet.length - 1] + k; ++c)
			luckiest.add(new Num(INF, c));

		int[] res = new int[k];
		int c = 0;

		for (Num n : luckiest) {
			res[c++] = n.second;

			if (c >= k)
				return res;
		}

		return null;
	}

}
