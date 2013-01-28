import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class Primes {

	public static BitSet sieveBs(int m) {
		BitSet primes = new BitSet(m + 1);
		primes.set(2, m + 1, true);

		for (int i = 2; i <= m; ++i)
			if (primes.get(i))
				for (int j = i + i; j <= m; j += i)
					primes.clear(j);

		return primes;
	}

	public static boolean[] sieveArr(int m) {
		boolean[] primes = new boolean[m + 1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i <= m; ++i)
			if (primes[i])
				for (int j = i + i; j <= m; j += i)
					primes[j] = false;

		return primes;
	}

	/**
	 * Sieve with odd array result
	 *
	 * @param m
	 *            - amount of numbers
	 * @return - array, whose indexes correponds to [3, 5, 7], so i = (n-3) / 2
	 *         and n = i*2 + 3
	 */
	public static boolean[] sieveArrOdd(int m) {
		boolean[] primes = new boolean[m];
		Arrays.fill(primes, true);

		for (int i = 0; i < m; ++i)
			if (primes[i])
				for (int j = i * 3 + 3, s = i * 2 + 3; j < m; j += s)
					primes[j] = false;

		return primes;
	}

	public static List<Integer> primeList(boolean[] sieve, int start, int step) {
		ArrayList<Integer> primes = new ArrayList<Integer>((int) (2 * sieve.length / Math.log(sieve.length) + 10));

		for (int i = 0, s = sieve.length; i < s; ++i)
			if (sieve[i])
				primes.add(i * step + start);

		return primes;
	}

	public static void sieveBlockOdd(boolean[] block, int start, List<Integer> primes) {
		Arrays.fill(block, true);

		for (int prime : primes) {
			if (start % prime == 0)
				block[0] = false;

			int first = prime - ((start - prime) % (prime + prime)) / 2;

			for (int i = first; i < block.length; i += prime)
				block[i] = false;
		}
	}

	public static void main(String[] args) {

		// Simple sieve sum

		System.out.println("Started");

		long sum = 0;
		boolean[] primes = sieveArr(19999999);

		for (int i = 0; i < primes.length; ++i)
			if (primes[i])
				sum += i;

		System.out.println(sum);

		// Odd sieve sum

		long sumOdd = 2;
		boolean[] primesOdd = sieveArrOdd((19999999 - 3) / 2 + 1);

		for (int i = 0; i < primesOdd.length; ++i)
			if (primesOdd[i])
				sumOdd += i * 2 + 3;

		System.out.println(sumOdd);

		// Block sum

		long sumBlk = 2;
		List<Integer> primeSqrt = primeList(sieveArrOdd(2500), 3, 2);
		int nextCand = primeSqrt.get(primeSqrt.size() - 1) + 2;

		boolean[] block = new boolean[5000];

		for (int prime : primeSqrt)
			sumBlk += prime;

		for (int start = nextCand; start <= 19999999; start += block.length * 2) {
			sieveBlockOdd(block, start, primeSqrt);

			for (int i = 0; i < block.length; ++i)
				if (block[i] && (i * 2 + start) <= 19999999)
					sumBlk += i * 2 + start;
		}

		System.out.println(sumBlk);
	}

}
