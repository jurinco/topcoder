import static java.lang.Math.*;

public class WidgetRepairs {

	public int days(int[] arrivals, int numPerDay) {
		int time = 0;
		int op = 0;
		int count = 0;

		while (time < arrivals.length || count > 0) {
			if (time < arrivals.length)
				count += arrivals[time];

			if (count > 0) {
				count = max(0, count - numPerDay);
				op++;
			}

			time++;
		}

		return op;
	}

}
