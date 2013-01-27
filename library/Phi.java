public class Phi {

	public static int phi(int x) {
		int res = x;

		for (int i = 2; i * i <= x; ++i) {
			if (x % i == 0) {
				res -= res / i;

				while (x % i == 0)
					x /= i;
			}
		}

		if (x > 1)
			res -= res / x;

		return res;
	}

	public static void main(String[] args) {
		System.out.println(phi(13));
	}

}
