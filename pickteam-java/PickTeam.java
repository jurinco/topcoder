/*
 * SRM153-D2-1000
 * SOLVED
 */

import java.util.*;

public class PickTeam {

	public String[] pickPeople(int teamSize, String[] people) {
		String[] names = new String[people.length];
		int[][] m = new int[people.length][people.length];

		for (int i = 0; i < people.length; ++i) {
			String[] parts = people[i].split(" ");

			names[i] = parts[0];
			for (int j = 0; j < people.length; ++j)
				m[i][j] = Integer.valueOf(parts[j + 1]);
		}

		int msum = Integer.MIN_VALUE;
		String[] res = new String[teamSize];

		for (int s = 0; s < (1 << people.length); ++s)
			if (Integer.bitCount(s) == teamSize) {
				int sum = 0;

				for (int i = 0; i < people.length; ++i)
					if ((s & (1 << i)) != 0)
						for (int j = 0; j < people.length; ++j)
							if ((s & (1 << j)) != 0)
								sum += m[i][j];

				if (sum > msum) {
					msum = sum;

					int j = 0;
					for (int i = 0; i < people.length; ++i)
						if ((s & (1 << i)) != 0)
							res[j++] = names[i];
				}
			}

		Arrays.sort(res);

		return res;
	}
}
