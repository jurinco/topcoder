/*
 * SRM154-D2-300
 * SOLVED
 */

public class ProfitCalculator {

	public int percent(String[] items) {
		double sumPrice = 0;
		double sumCost = 0;

		for (String item : items) {
			String[] parts = item.split(" ");

			sumPrice += Double.valueOf(parts[0]);
			sumCost += Double.valueOf(parts[1]);
		}

		return (int) ((sumPrice - sumCost) * 100 / sumPrice);
	}

}
