/*
 * SRM529-D1-250
 * SOLVED
 */

import java.util.*;

public class KingSort {

	static final String[] ones = ", I, II, III, IV, V, VI, VII, VIII, IX".split(", ");
	static final String[] decs = ", X, XX, XXX, XL, L".split(", ");

	static class King implements Comparable<King> {
		public final String name, full;
		public final int number;

		public King(String fullName) {
			String[] parts = fullName.split(" ");

			full = fullName;
			name = parts[0];
			number = toNumber(parts[1]);
		}

		private static int toNumber(String num) {
			for (int dec = 0; dec < decs.length; ++dec)
				for (int one = 0; one < ones.length; ++one)
					if (num.equals(decs[dec] + ones[one]))
						return (dec) * 10 + one;
			return 0;
		}

		public int compareTo(King o) {
			int r = name.compareTo(o.name);
			return r != 0 ? r : number - o.number;
		}

	}

	public String[] getSortedList(String[] ka) {
		ArrayList<King> kl = new ArrayList<King>();

		for (String k : ka)
			kl.add(new King(k));

		Collections.sort(kl);

		for (int i = 0; i < kl.size(); ++i)
			ka[i] = kl.get(i).full;

		return ka;
	}

}
