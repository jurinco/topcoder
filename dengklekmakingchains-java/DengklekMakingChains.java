/*
 * SRM532-D1-300
 * SOLVED
 * UGLY
 */

import java.util.*;

import static java.lang.Math.*;

public class DengklekMakingChains {

	public static final Comparator<int[]> COMPARATOR = new Comparator<int[]>() {

		public int compare(int[] o1, int[] o2) {
			for (int i = 0; i < o1.length; ++i) {
				if (o1[i] < o2[i])
					return 1;
				if (o1[i] > o2[i])
					return -1;
			}

			return 0;
		}

	};

	static int RUST = '.' - '0';

	public int maxBeauty(String[] chains) {
		int beauty = maxBeautyNoSingle(chains);

		for (String s : chains)
			if (s.charAt(0) == '.' && s.charAt(2) == '.')
				beauty = max(beauty, s.charAt(1) - '0');

		return beauty;
	}

	private int maxBeautyNoSingle(String[] chains) {
		TreeSet<int[]> bestLeft = new TreeSet<int[]>(COMPARATOR);
		TreeSet<int[]> bestRight = new TreeSet<int[]>(COMPARATOR);

		int beauty = 0;

		for (int i = 0; i < chains.length; ++i) {
			String s = chains[i];

			int bl = s.charAt(0) - '0';
			int bm = s.charAt(1) - '0';
			int br = s.charAt(2) - '0';

			if (bl != RUST && bm != RUST && br != RUST)
				beauty += bl + bm + br;
			else {
				if (bl != RUST) {

					if (bm != RUST)
						bestLeft.add(new int[] { bl + bm, i });
					else
						bestLeft.add(new int[] { bl, i });
				}

				if (br != RUST) {
					if (bm != RUST)
						bestRight.add(new int[] { br + bm, i });
					else
						bestRight.add(new int[] { br, i });
				}

			}

		}

		if (bestLeft.isEmpty() && bestRight.isEmpty())
			return beauty;

		if (bestLeft.isEmpty())
			return beauty + bestRight.first()[0];

		if (bestRight.isEmpty())
			return beauty + bestLeft.first()[0];

		int[] l1 = bestLeft.first();
		int[] r1 = bestRight.first();

		if (l1[1] != r1[1])
			return l1[0] + beauty + r1[0];

		bestLeft.remove(l1);
		bestRight.remove(r1);

		int[] l2 = null, r2 = null;

		if (bestLeft.size() > 0)
			l2 = bestLeft.first();

		if (bestRight.size() > 0)
			r2 = bestRight.first();

		if (l2 == null && r2 == null)
			return beauty + max(l1[0], r1[0]);

		if (r2 == null)
			return beauty + max(l2[0] + r1[0], l1[0]);

		if (l2 == null)
			return beauty + max(l1[0] + r2[0], r1[0]);

		return beauty + max(l1[0] + r2[0], l2[0] + r1[0]);
	}

}
