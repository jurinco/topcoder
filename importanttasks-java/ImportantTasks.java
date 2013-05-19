/*
 * SRM447-D2-250
 * SOLVED
 */

import java.util.*;

public class ImportantTasks {

	public int maximalCost(int[] complexity, int[] computers) {
		Arrays.sort(complexity);
		Arrays.sort(computers);

		int cnt = 0;
		for (int m : computers)
			for (int i = complexity.length - 1; i >= 0; --i)
				if (complexity[i] >= 0 && complexity[i] <= m) {
					cnt++;
					complexity[i] = -1;
					break;
				}

		return cnt;
	}

}
