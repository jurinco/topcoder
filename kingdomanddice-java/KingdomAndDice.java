/*
 * SRM548-D1-450
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class KingdomAndDice {

	public double newFairness(int[] firstDie, int[] secondDie, int X) {
		Arrays.sort(secondDie);

		int wins = 0;
		int count = firstDie.length * secondDie.length;
		double mean = 0.5 * count;
		int nulls = 0;

		for (int num : firstDie)
			if (num != 0)
				wins += wins(num, secondDie);
			else
				nulls++;

		TreeSet<Integer> poss = new TreeSet<Integer>();
		poss.add(wins);

		for (int i = 0; i < nulls; ++i) {
			TreeSet<Integer> newPoss = (TreeSet<Integer>) poss.clone();

			int p = 0;
			for (int j = 0; j < secondDie.length; ++j) {
				int n = secondDie[j];

				if (n - p - 1 > i + countFirst(p, n, firstDie)) {
					for (int k : poss) {
						newPoss.add(k + j);
					}
				}

				p = n;
			}

			if (X - p > i + countFirst(p, X + 1, firstDie)) {
				for (int k : poss) {
					newPoss.add(k + secondDie.length);
				}
			}

			poss = newPoss;
		}

		TreeMap<Double, Double> diffSet = new TreeMap<Double, Double>();

		for (int n : poss) {
			if (!diffSet.containsKey(abs(n - mean)))
				diffSet.put(abs(n - mean), (double) n);
		}

		return diffSet.get(diffSet.firstKey()) / count;
	}

	private int countFirst(int p, int n, int[] firstDie) {
		int c = 0;
		for (int v : firstDie)
			if (v > p && v < n)
				c++;
		return c;
	}

	int wins(int num, int[] secondDie) {
		int c = 0;
		for (int n : secondDie)
			if (n < num)
				c++;

		return c;
	}

}
