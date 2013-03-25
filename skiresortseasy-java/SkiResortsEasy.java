/*
 * SRM573-D2-250
 * SOLVED
 */

public class SkiResortsEasy {

	public int minCost(int[] altitude) {
		int cost = 0;
		int prev = altitude[0];

		for (int a : altitude)
			if (a > prev)
				cost += a - prev;
			else
				prev = a;

		return cost;
	}

}
