/*
 * SRM191-D2-250
 * SOLVED
 */

public class BettingMoney {

	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int res = 0;

		for (int i = 0; i < amounts.length; i++)
			if (i != finalResult)
				res += amounts[i] * 100;

		return res - amounts[finalResult] * centsPerDollar[finalResult];
	}

}
