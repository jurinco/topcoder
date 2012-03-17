/*
 * SRM436D1-250
 * SOLVED
 */

public class BestView {

	public int numberOfBuildings(int[] heights) {
		int max = 0;

		for (int i = 0; i < heights.length; ++i)
			max = Math.max(max, countSeen(heights, i, -1) + countSeen(heights, i, 1));

		return max;
	}

	private int countSeen(int[] heights, int from, int dir) {
		int count = 0;
		double tan = Double.NEGATIVE_INFINITY;

		for (int i = from + dir; i >= 0 && i < heights.length; i += dir) {
			double t = (double) (heights[i] - heights[from]) / Math.abs(from - i);

			if (t > tan) {
				count++;
				tan = t;
			}
		}

		return count;
	}

}
