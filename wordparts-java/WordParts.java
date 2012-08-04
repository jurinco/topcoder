/*
 * SRM156-D2-1000
 * SOLVED
 */

public class WordParts {

	public int partCount(String original, String compound) {
		int[] parts = new int[compound.length() + 1];

		parts[0] = 0;

		for (int i = 1; i <= compound.length(); ++i) {
			int m = -1;

			for (int j = 0; j < i; ++j)
				if (parts[j] >= 0 && (original.startsWith(compound.substring(j, i)) || original.endsWith(compound.substring(j, i))) && (m < 0 || parts[j] + 1 < m))
					m = parts[j] + 1;

			parts[i] = m;
		}

		return parts[compound.length()];
	}

}
