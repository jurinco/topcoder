/*
 * SRM524D2-250
 * SOLVED
 */
import static java.lang.Math.*;

public class ShippingCubes {

	public int minimalCost(int N) {
		int cost = Integer.MAX_VALUE;

		for (int a = 1; a <= N; ++a)
			if (N % a == 0)
				for (int b = 1; a * b <= N; ++b)
					if (N % (a * b) == 0)
						cost = min(cost, a + b + (N / (a * b)));

		return cost;
	}

}
