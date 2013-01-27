public class Gcd {

	public static int gcd(int a, int b) {
		if (a > b)
			return gcd(b, a);

		while (a > 0) {
			int c = a;
			a = b % a;
			b = c;
		}

		return b;
	}

	public static class GcdEx {
		public int g, x, y;

		public GcdEx(int g, int x, int y) {
			this.g = g;
			this.x = x;
			this.y = y;
		}
	}

	public static GcdEx gcdex(int a, int b) {
		if (a > b)
			return gcdex(b, a);

		if (a == 0)
			return new GcdEx(b, 0, 1);

		GcdEx res = gcdex(b % a, a);

		int ox = res.x;
		res.x = res.y - (b / a) * res.x;
		res.y = ox;

		return res;
	}

	public static void main(String[] args) {
		GcdEx r = gcdex(12, 8);

		System.out.println(r.g + " " + r.x + " " + r.y);
	}

}
