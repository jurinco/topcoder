/*
 * SRM159-D2-500
 * SOLVED
 */

import java.util.*;

public class Sets {

	@SuppressWarnings("unchecked")
	public int[] operate(int[] A, int[] B, String operation) {
		TreeSet<Integer> sa = new TreeSet<Integer>();
		for (int a : A)
			sa.add(a);

		TreeSet<Integer> sb = new TreeSet<Integer>();
		for (int b : B)
			sb.add(b);

		TreeSet<Integer> res;
		if (operation.equals("UNION")) {
			res = sa;
			res.addAll(sb);
		} else if (operation.equals("INTERSECTION")) {
			res = sa;
			res.retainAll(sb);
		} else if (operation.equals("SYMMETRIC DIFFERENCE")) {
			res = (TreeSet<Integer>) sa.clone();
			res.addAll(sb);

			sa.retainAll(sb);
			res.removeAll(sa);
		} else {
			throw new IllegalArgumentException();
		}

		int[] resArr = new int[res.size()];

		int i = 0;
		for (int v : res)
			resArr[i++] = v;

		return resArr;
	}

}
