/*
 * SRM462-D2-500
 * SOLVED
 */

public class AgeEncoding {

	public double getRadix(int age, String candlesLine) {
		if (!candlesLine.contains("1"))
			return -1;

		if (candlesLine.endsWith("1")) {
			if (!candlesLine.substring(0, candlesLine.length() - 1).contains("1"))
				return age == 1 ? -2 : -1;
			else if (age == 1)
				return -1;
		}

		double min = 0;
		double max = 100;

		for (int iter = 0; iter < 10000; ++iter) {
			double mid = (min + max) / 2;
			double res = 0;

			for (int i = 0; i < candlesLine.length(); ++i)
				res = mid * res + (candlesLine.charAt(i) == '1' ? 1 : 0);

			if (res <= age)
				min = mid;
			else
				max = mid;
		}

		return min;
	}

}
