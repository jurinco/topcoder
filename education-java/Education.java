/*
 * SRM196-D2-250
 * SOLVED
 */

import java.util.*;

public class Education {

	public int minimize(String desire, int[] tests) {
		HashMap<String, Integer> levels = new HashMap<String, Integer>();
		levels.put("A", 90);
		levels.put("B", 80);
		levels.put("C", 70);
		levels.put("D", 60);

		int last = levels.get(desire) * (tests.length + 1) - arsum(tests);

		if (last < 0)
			return 0;
		if (last > 100)
			return -1;

		return last;
	}

	private int arsum(int[] arr) {
		int sum = 0;
		for (int v : arr)
			sum += v;
		return sum;
	}
}
