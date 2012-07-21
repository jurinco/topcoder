/*
 * SRM153-D2-250
 * SOLVED
 */

public class MostProfitable {

	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		String bestItem = "";
		int bestProfit = 0;

		for (int i = 0; i < items.length; ++i) {
			int profit = (prices[i] - costs[i]) * sales[i];

			if (profit > bestProfit) {
				bestItem = items[i];
				bestProfit = profit;
			}
		}

		return bestItem;
	}

}
