/*
 * SRM450-D1-500
 * SOLVED
 */

import java.math.BigInteger;
import static java.lang.Math.*;

public class StrongEconomy {

	public long earn(long n, long k, long price, long target) {
		long res = timeToReach(n, k, target);
		long prewait = 0;
		long cur = 0;

		while (res > prewait) {
			long wait = timeToReach(n, k, price - cur);

			if (wait + prewait >= res)
				return res;

			cur += wait * (n * k);
			prewait += wait;

			long c = cur / price;

			if (n < k && n + c <= k) {
				n += c;
			} else if (k < n && k + c <= n) {
				k += c;
			} else {
				long s = n + k + c;
				n = s / 2;
				k = s - n;
			}

			cur -= c * price;
			res = min(res, timeToReach(n, k, target - cur) + prewait);
		}

		return res;
	}

	private long timeToReach(long n, long k, long target) {
		return BigInteger.valueOf(max(target - 1, 0L)).divide(BigInteger.valueOf(n).multiply(BigInteger.valueOf(k))).longValue() + 1;
	}

}
