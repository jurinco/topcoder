/*
 * SRM437D2-250
 * SOLVED
 */

import java.util.*;

public class TheBeauty {

	public int find(int n) {
		HashSet<Integer> digits = new HashSet<Integer>();

		while (n > 0) {
			digits.add(n % 10);
			n /= 10;
		}

		return digits.size();
	}

}
