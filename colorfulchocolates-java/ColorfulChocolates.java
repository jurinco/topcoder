/*
 * SRM551-D1-250
 * SOLVED
 * UGLY
 */

import java.util.*;

import static java.lang.Math.*;

public class ColorfulChocolates {

	public int maximumSpread(String chocolates, int maxSwaps) {
		TreeSet<Character> colors = findColors(chocolates);
		int res = 0;

		for (Character c : colors)
			res = max(res, spread(c, chocolates.toCharArray(), maxSwaps));

		return res;
	}

	private int spread(char col, char[] chocolates, int maxSwaps) {
		TreeSet<Integer> indexes = new TreeSet<Integer>();

		for (int i = 0; i < chocolates.length; ++i)
			if (chocolates[i] == col)
				indexes.add(i);

		return spread(indexes, maxSwaps);
	}

	private int spread(TreeSet<Integer> indexes, int maxSwaps) {
		int res = 0;

		for (int i = indexes.first(); i <= indexes.last(); ++i)
			res = max(res, spread(indexes, maxSwaps, i));

		return res;
	}

	private int spread(TreeSet<Integer> indexes, int maxSwaps, int c) {
		@SuppressWarnings("unchecked")
		TreeSet<Integer> curins = (TreeSet<Integer>) indexes.clone();

		int nearest = -1;
		int dist = Integer.MAX_VALUE;
		for (Integer ind : curins)
			if (abs(ind - c) < dist) {
				dist = abs(ind - c);
				nearest = ind;
			}

		if (dist > maxSwaps)
			return 0;

		int res = 1;
		int l = nearest;
		int r = nearest;
		curins.remove(nearest);
		maxSwaps -= dist;

		while (!curins.isEmpty()) {
			nearest = -1;
			dist = Integer.MAX_VALUE;

			for (Integer ind : curins) {
				if (ind < l && l - ind - 1 < dist) {
					dist = l - ind - 1;
					nearest = ind;
				} else if (ind > r && ind - 1 - r < dist) {
					dist = ind - 1 - r;
					nearest = ind;
				}
			}

			if (dist > maxSwaps)
				return res;

			res++;
			if (nearest < l) {
				l--;
			} else if (nearest > r) {
				r++;
			}
			curins.remove(nearest);
			maxSwaps -= dist;
		}

		return res;
	}

	private TreeSet<Character> findColors(String chocolates) {
		TreeSet<Character> res = new TreeSet<Character>();

		for (char c : chocolates.toCharArray())
			res.add(c);

		return res;
	}

}
