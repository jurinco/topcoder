/*
 * SRM157-D2-550
 * SOLVED
 */

import static java.lang.Math.*;

public class Salary {

	public int howMuch(String[] arrival, String[] departure, int wage) {
		int normSeconds = 0;
		int bonusSeconds = 0;

		int dayStart = seconds("06:00:00");
		int nightStart = seconds("18:00:00");

		for (int i = 0; i < arrival.length; ++i) {
			int arrivalSec = seconds(arrival[i]);
			int departureSec = seconds(departure[i]);

			normSeconds += departureSec - arrivalSec;

			bonusSeconds += min(dayStart, departureSec) - min(dayStart, arrivalSec);
			bonusSeconds += max(departureSec, nightStart) - max(arrivalSec, nightStart);
		}

		return (int) (((long) normSeconds * wage + (bonusSeconds * wage) / 2) / 3600);
	}

	private int seconds(String time) {
		String[] parts = time.split(":");

		return Integer.valueOf(parts[0]) * 3600 + Integer.valueOf(parts[1]) * 60 + Integer.valueOf(parts[2]);
	}

}
