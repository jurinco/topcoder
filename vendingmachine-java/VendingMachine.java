/*
 * SRM145D2-1000
 * SOLVED
 */

import static java.lang.Math.*;

public class VendingMachine {

	class Machine {

		private final int[][] state;
		private final int[] sums;

		private int current = 0;

		public int time = 0;

		public Machine(String[] prices) {
			state = new int[prices.length][];

			for (int i = 0; i < prices.length; i++) {
				String[] parts = prices[i].split(" ");
				state[i] = new int[parts.length];

				for (int j = 0; j < parts.length; j++)
					state[i][j] = Integer.valueOf(parts[j]);
			}

			sums = new int[state[0].length];

			for (int i = 0; i < sums.length; i++) {
				int sum = 0;

				for (int j = 0; j < state.length; j++)
					sum += state[j][i];

				sums[i] = sum;
			}
		}

		public void reset() {
			int maxSum = 0;
			for (int v : sums)
				maxSum = max(maxSum, v);

			for (int i = 0; i < sums.length; i++) {
				if (sums[i] == maxSum) {
					rotate(i);
					return;
				}
			}
		}

		public int distance(int to) {
			return min((to - current + sums.length) % sums.length, (current - to + sums.length) % sums.length);
		}

		public void rotate(int to) {
			time += distance(to);
			current = to;
		}

		public boolean buy(int shelf, int column) {
			if (state[shelf][column] == 0)
				return false;

			rotate(column);

			sums[column] -= state[shelf][column];
			state[shelf][column] = 0;

			return true;
		}
	}

	public int motorUse(String[] prices, String[] purchases) {
		Machine m = new Machine(prices);

		int lastTime = -1;
		for (String purchase : purchases) {
			String[] parts = purchase.split("[,:]");
			int shelf = Integer.valueOf(parts[0]);
			int column = Integer.valueOf(parts[1]);
			int time = Integer.valueOf(parts[2]);

			if (lastTime < 0 || time - lastTime >= 5)
				m.reset();

			if (!m.buy(shelf, column))
				return -1;

			lastTime = time;
		}

		m.reset();

		return m.time;
	}

}
