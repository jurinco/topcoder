/*
 * SRM195-D2-500
 * SOLVED
 */

import java.util.*;

public class FanFailure {

	public int[] getRange(int[] capacities, int minCooling) {
		Arrays.sort(capacities);

		int total = arsum(capacities);

		return new int[] { mfs(capacities, minCooling, total), mfc(capacities, minCooling, total) };
	}

	private int mfs(int[] capacities, int minCooling, int total) {
		int cur = 0;

		for (int i = 0; i < capacities.length; ++i) {
			if (cur + capacities[i] + minCooling > total)
				return i;

			cur += capacities[i];
		}

		return capacities.length;
	}

	private int mfc(int[] capacities, int minCooling, int total) {
		int cur = 0;

		for (int i = capacities.length - 1; i >= 0; --i) {
			if (cur + capacities[i] + minCooling > total)
				return capacities.length - i - 1;

			cur += capacities[i];
		}

		return capacities.length;
	}

	private int arsum(int[] arr) {
		int sum = 0;
		for (int v : arr)
			sum += v;
		return sum;
	}

}
