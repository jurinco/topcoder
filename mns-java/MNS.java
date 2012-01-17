public class MNS {

	class NumBag {
		int[] counts;
		int count;

		public NumBag(int[] numbers) {
			counts = new int[10];
			count = 9;

			for (int i = 0; i < counts.length; i++)
				counts[i] = 0;

			for (int n : numbers)
				counts[n]++;
		}

		public boolean contains(int n) {
			return counts[n] > 0;
		}

		public void remove(int n) {
			counts[n]--;
			count--;
		}

		public void add(int n) {
			counts[n]++;
			count++;
		}

		public int size() {
			return count;
		}
	}

	public int combos(int[] numbers) {
		int rowSum = 0;

		for (int n : numbers)
			rowSum += n;

		if (rowSum % 3 != 0)
			return 0;

		rowSum = rowSum / 3;

		return countSquares(rowSum, new NumBag(numbers), new int[9], 0);
	}

	private int countSquares(int sum, NumBag nums, int[] square, int pos) {
		if (pos == 9)
			return 1;

		int count = 0;

		for (int i = 0; i <= 9; ++i)
			if (nums.contains(i)) {
				square[pos] = i;
				nums.remove(i);

				if (pos % 3 == 2 && square[pos] + square[pos - 1] + square[pos - 2] != sum)
					count += 0;
				else if (pos >= 6 && square[pos] + square[pos - 3] + square[pos - 6] != sum)
					count += 0;
				else
					count += countSquares(sum, nums, square, pos + 1);

				nums.add(i);
			}

		return count;
	}

}
