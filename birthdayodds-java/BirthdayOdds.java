/*
 * SRM174-D1-250
 * SOLVED
 */

public class BirthdayOdds {

	public int minPeople(int minOdds, int daysInYear) {
		double noOdds = 100;
		int people = 1;

		while (noOdds > 100 - minOdds)
			noOdds = noOdds * (daysInYear - people++) / daysInYear;

		return people;
	}

}
