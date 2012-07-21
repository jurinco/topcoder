/*
 * SRM152-D2-500
 * SOLVED
 */

import java.util.*;

public class LeaguePicks {

	public int[] returnPicks(int position, int friends, int picks) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		if (friends == 1) {
			for (int i = 1; i <= picks; ++i)
				res.add(i);
		} else {
			int i = position;

			while (i <= picks) {
				res.add(i);

				i += (friends - position) * 2 + 1;

				if (i <= picks) {
					res.add(i);
					i += (position - 1) * 2 + 1;
				}
			}
		}

		int[] rr = new int[res.size()];

		for (int i = 0; i < res.size(); ++i)
			rr[i] = res.get(i);
		return rr;
	}

}
