/*
 * SRM151-D2-1000
 * SOLVED
 */

import java.util.*;

public class MergeSort {

	public int howManyComparisons(int[] numbers) {
		int[] counter = new int[1];
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int n : numbers)
			list.add(n);

		mergeSort(list, counter);

		return counter[0];
	}

	private List<Integer> mergeSort(List<Integer> list, int[] count) {
		if (list.size() <= 1)
			return list;

		List<Integer> left = mergeSort(list.subList(0, list.size() / 2), count);
		List<Integer> right = mergeSort(list.subList(list.size() / 2, list.size()), count);

		return merge(left, right, count);

	}

	private List<Integer> merge(List<Integer> left, List<Integer> right, int[] count) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		int i = 0, j = 0;
		while (i < left.size() && j < right.size()) {
			count[0]++;

			if (left.get(i) < right.get(j)) {
				res.add(left.get(i++));
			} else if (left.get(i) > right.get(j)) {
				res.add(right.get(j++));
			} else {
				res.add(left.get(i++));
				res.add(right.get(j++));
			}
		}

		while (i < left.size())
			res.add(left.get(i++));

		while (j < right.size())
			res.add(right.get(j++));

		return res;
	}

}
