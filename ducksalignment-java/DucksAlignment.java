/*
 * SRM526-D1-250
 * UNSOLVED
 */

import java.util.*;
import static java.lang.Math.*;

class Duck {
	public final int x, y;

	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class DucksAlignment {

	int colCost(List<Duck> ducks, int x, int h) {
		int[] coords = new int[ducks.size()];
		int cost = 0;

		for (int i = 0; i < ducks.size(); ++i) {
			coords[i] = ducks.get(i).y;
			cost += abs(ducks.get(i).x - x);
		}

		return cost + groupCost(coords, h);
	}

	int rowCost(List<Duck> ducks, int y, int w) {
		int[] coords = new int[ducks.size()];
		int cost = 0;

		for (int i = 0; i < ducks.size(); ++i) {
			coords[i] = ducks.get(i).x;
			cost += abs(ducks.get(i).y - y);
		}

		return cost + groupCost(coords, w);
	}

	int groupCost(int[] coords, int m) {
		Arrays.sort(coords);

		int minCost = Integer.MAX_VALUE;

		for (int first = 0; first <= m - coords.length; ++first) {
			int cost = 0;
			int prev = first;

			for (int i = 0; i < coords.length; ++i) {
				cost += abs(coords[i] - prev);
				prev++;
			}

			minCost = min(cost, minCost);
		}

		return minCost;
	}

	List<Duck> countDucks(String[] grid) {
		ArrayList<Duck> res = new ArrayList<Duck>();
		int w = grid[0].length();
		int h = grid.length;

		for (int y = 0; y < h; ++y) {
			for (int x = 0; x < w; ++x) {
				if (grid[y].charAt(x) == 'o')
					res.add(new Duck(x, y));
			}
		}

		return res;
	}

	public int minimumTime(String[] grid) {
		List<Duck> ducks = countDucks(grid);

		int min = Integer.MAX_VALUE;

		for (int x = 0; x < grid[0].length(); ++x)
			min = min(min, colCost(ducks, x, grid.length));

		for (int y = 0; y < grid.length; ++y)
			min = min(min, rowCost(ducks, y, grid[0].length()));

		return min;
	}

}
