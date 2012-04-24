/*
 * SRM524-D2-1000
 * UNSOLVED
 */

import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.*;

public class MultiplesWithLimit {

	public String minMultiples(int N, int[] forbiddenDigits) {
		if (forbiddenDigits.length == 10)
			return "IMPOSSIBLE";
		if (forbiddenDigits.length == 0)
			return String.valueOf(N);

		Arrays.sort(forbiddenDigits);

		return "";
	}

}
