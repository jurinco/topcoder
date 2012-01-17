import static java.lang.Math.*;

public class BigBurger {

	public int maxWait(int[] arrival, int[] service) {
		int time = 0;
		int[] results = new int[arrival.length];
		
		for (int i = 0; i < arrival.length; ++i) {
			if (time < arrival[i])
				time = arrival[i];

			results[i] = time;
			time += service[i];
		}
				
		int max = 0;
		for (int i = 0; i < arrival.length; ++ i)
			max = max(max, results[i] - arrival[i]);

		return max;
	}

}
