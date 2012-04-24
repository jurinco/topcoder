/*
 * SRM145-D2-500
 * UNSOLVED
 */

public class ExerciseMachine {

	public int getPercentages(String time) {
		String[] parts = time.split(":");
		int seconds = Integer.valueOf(parts[0]) * 3600 + Integer.valueOf(parts[1]) * 60 + Integer.valueOf(parts[2]);

		int count = 0;

		for (int i = 1; i < seconds; ++i)
			if ((i * 100) % seconds == 0)
				count++;

		return count;
	}

}
