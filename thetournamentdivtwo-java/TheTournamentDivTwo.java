/*
 * SRM453-D2-250
 * SOLVED
 */

public class TheTournamentDivTwo {

	public int find(int[] points) {
		int sum = arsum(points);

		if (sum % 2 != 0)
			return -1;

		return sum / 2;
	}

	private int arsum(int[] arr) {
		int sum = 0;
		for (int v : arr)
			sum += v;
		return sum;
	}

}
