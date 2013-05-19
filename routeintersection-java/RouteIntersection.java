/*
 * SRM474D2-500
 * SOLVED
 */

import java.util.*;

public class RouteIntersection {

	public String isValid(int N, int[] coords, String moves) {
		TreeMap<Integer, Integer> cur = new TreeMap<Integer, Integer>();
		HashSet<String> visited = new HashSet<String>();

		visited.add(cur.toString());

		for (int i = 0; i < coords.length; ++i) {
			cur = move(cur, coords[i], moves.charAt(i));

			if (visited.contains(cur.toString()))
				return "NOT VALID";

			visited.add(cur.toString());
		}

		return "VALID";
	}

	@SuppressWarnings("unchecked")
	private TreeMap<Integer, Integer> move(TreeMap<Integer, Integer> cur, int i, char d) {
		TreeMap<Integer, Integer> next = (TreeMap<Integer, Integer>) cur.clone();
		Integer v = cur.get(i);

		if (v == null)
			v = 0;

		if (d == '+')
			v++;
		else
			v--;

		if (v == 0)
			next.remove(i);
		else
			next.put(i, v);

		return next;
	}

}
