/*
 * SRM159-D2-250
 * SOLVED
 */

public class StreetParking {

	public int freeParks(String street) {
		int c = 0;

		for (int i = 0; i < street.length(); i++) {
			if (street.charAt(i) != '-')
				continue;

			if (i < street.length() - 1 && (street.charAt(i + 1) == 'B' || street.charAt(i + 1) == 'S'))
				continue;

			if (i < street.length() - 2 && street.charAt(i + 2) == 'B')
				continue;

			if (i > 0 && street.charAt(i - 1) == 'S')
				continue;

			c++;
		}

		return c;
	}

}
