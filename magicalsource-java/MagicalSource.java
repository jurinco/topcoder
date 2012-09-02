/*
 * SRM451-D1-250
 * SOLVED
 * UGLY
 */

public class MagicalSource {

	public long calculate(long x) {
		int mr = size10(x);

		for (int r = mr; r > 0; --r) {
			long res = find(x, r);

			if (res > 0)
				return res;
		}

		return -1;
	}

	private long find(long x, int times) {
		if (x == 0)
			return 0;

		long dig = x % 10;
		long dif = repeat(dig, times);

		if (x < dif)
			return -1;

		long prefix = find((x - dif) / 10, times);

		if (prefix < 0)
			return -1;

		return prefix * 10 + dig;
	}

	private long repeat(long d, long times) {
		long c = 0;

		for (int i = 0; i < times; ++i, d *= 10)
			c += d;

		return c;
	}

	private int size10(long x) {
		int s = 0;
		while (x > 0) {
			s++;
			x /= 10;
		}
		return s;
	}
}
