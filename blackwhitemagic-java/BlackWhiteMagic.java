/*
 * TCO11-1B-250
 * SOLVED
 */

public class BlackWhiteMagic {

	public int count(String creatures) {
		int first = 0;
		int last = creatures.length() - 1;
		int count = 0;

		while (last > first) {
			while (first < creatures.length() && creatures.charAt(first) == 'W')
				first++;

			while (last >= 0 && creatures.charAt(last) == 'B')
				last--;

			if (last < first)
				return count;

			first++;
			last--;
			count++;
		}

		return count;
	}

}
