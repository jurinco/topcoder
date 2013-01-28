import java.util.ArrayList;
import java.util.Arrays;

public class Factorization {

	public static int countDelims(int n) {
		int c = 0;

		while (n % 2 == 0) {
			n /= 2;
			c++;
		}

		for (int i = 3; i * i <= n; i += 2)
			while (n % i == 0) {
				n /= i;
				c++;
			}

		if (n > 1)
			c++;

		return c;
	}

	public static int[] minDelims(int count) {
		int[] minDelims = new int[count];

		Arrays.fill(minDelims, 0);

		minDelims[0] = -1;
		minDelims[1] = -1;

		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < count; ++i) {
			if (minDelims[i] == 0) {
				minDelims[i] = i;
				primes.add(i);
			}

			int md = minDelims[i];

			for (int prime : primes) {
				int j = prime * i;

				if (prime > md || j >= count)
					break;

				minDelims[j] = prime;
			}
		}

		return minDelims;
	}

	/**
	 *
	 * @param count
	 * @return i = (n-3)/2, n = i*2 + 3
	 */
	public static int[] minDelimsOdd(int count) {
		int[] minDelims = new int[count];

		Arrays.fill(minDelims, 0);

		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < count; ++i) {
			int n = i * 2 + 3;

			if (minDelims[i] == 0) {
				minDelims[i] = n;
				primes.add(n);
			}

			int md = minDelims[i];

			for (int prime : primes) {
				int j = (prime * n - 3) / 2;

				if (prime > md || j >= count)
					break;

				minDelims[j] = prime;
			}
		}

		return minDelims;
	}

	public static void main(String[] args) {

		// Simple minDelims
		int[] delims = minDelims(20);

		System.out.println("Simple min delims:");
		for (int i = 2; i < 10; ++i) {
			System.out.println(i + ": " + delims[i]);
		}

		// Odd minDelims
		int[] delimsOdd = minDelimsOdd(20);

		System.out.println("Odd min delims:");
		for (int i = 0; i < delimsOdd.length; ++i) {
			System.out.println((i * 2 + 3) + ": " + delimsOdd[i]);
		}
	}
}
