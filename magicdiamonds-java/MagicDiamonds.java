
public class MagicDiamonds {

	public boolean isPrime(long n) {
		if (n % 2 == 0)
			return false;

		long d = 3;

		while (d * d <= n) {
			if (n % d == 0)
				return false;

			d += 2;
		}

		return true;
	}

	public long minimalTransfer(long n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 3;

		return isPrime(n) ? 2 : 1;
	}

}
