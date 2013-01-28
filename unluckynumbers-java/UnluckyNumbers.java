/*
 * SRM438-D2-250
 * SOLVED
 */

import java.util.*;

public class UnluckyNumbers {

	public int getCount(int[] luckySet, int n) {
		Arrays.sort(luckySet);
		int pos = Arrays.binarySearch(luckySet, n);

		if (pos >= 0)
			return 0;

		int prev = pos < -1 ? luckySet[-2 - pos] : 0;
		int next = luckySet[-1 - pos];

		return (next - n) * (n - prev) - 1;
	}

}
