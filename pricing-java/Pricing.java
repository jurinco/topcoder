/*
 * SRM149-D2-1000
 * UNSOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class Pricing {

	public int maxSales(int[] price) {
		Arrays.sort(price);

		int max = 0;

		for (int g0 = 0; g0 < price.length; ++g0)
			for (int g1 = g0; g1 < price.length; ++g1)
				for (int g2 = g1; g2 < price.length; ++g2)
					for (int g3 = g2; g3 < price.length; ++g3)
						max = max(max, (g1 - g0) * price[g0] + (g2 - g1) * price[g1] + (g3 - g2) * price[g2] + (price.length - g3) * price[g3]);

		return max;
	}

}
