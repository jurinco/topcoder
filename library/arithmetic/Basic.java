package arithmetic;

public class Basic {

	public static int binpow(int x, int p) {
		int r = 1;

		while (p > 0) {
			if ((p & 1) != 0)
				r *= x;

			x *= x;
			p >>= 1;
		}

		return r;
	}

}
