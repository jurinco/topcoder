/*
 * SRM441-D1-250
 * SOLVED
 */

import java.util.*;

public class PerfectPermutation {

	public int reorder(int[] P) {
		BitSet marked = new BitSet(P.length);
		int cycles = 0;

		for (int i = 0; i < P.length; ++i)
			if (!marked.get(i)) {
				cycles++;

				int c = i;
				while (!marked.get(c)) {
					marked.set(c);
					c = P[c];
				}
			}

		return cycles > 1 ? cycles : 0;
	}

}
