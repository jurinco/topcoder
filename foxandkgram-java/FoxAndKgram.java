/*
 * TCO12-1B-250
 * SOLVED
 * UGLY
 */


import java.util.*;
import static java.lang.Math.*;

public class FoxAndKgram {

	public int maxK(int[] len) {
		int max = armax21(len);

		int r = 0;
		for (int i = 1; i <= max; ++i) {
			if (possible(i, len))
				r = i;
		}

		return r;
	}

	private boolean possible(int k, int[] len) {
		BitSet marked = new BitSet(len.length);

		for (int i = 0; i < k; ++i) {
			if (!possOne(k, len, marked) && !possTwo(k, len, marked))
				return false;
		}
		
		return true;
	}

	private boolean possOne(int k, int[] len, BitSet marked) {
		for (int j = 0; j < len.length; ++j)
			if (!marked.get(j) && len[j] == k) {
				marked.set(j);
				return true;
			}

		return false;
	}

	private boolean possTwo(int k, int[] len, BitSet marked) {
		for (int i = 0; i < len.length; ++i)
			for (int j = i + 1; j < len.length; ++j)
				if (!marked.get(i) && !marked.get(j) && len[j] + len[i] + 1 == k) {
					marked.set(i);
					marked.set(j);
					return true;
				}

		return false;
	}

	private int armax21(int[] arr) {
		int am = 0;
		for (int r1 : arr)
			for (int r2 : arr)
			am = max(am, r1+r2+1);
		return am;
	}

}
