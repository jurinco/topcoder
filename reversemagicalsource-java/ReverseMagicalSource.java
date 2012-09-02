/*
 * SRM451-D2-250
 * SOLVED
 */

public class ReverseMagicalSource {

	public int find(int source, int A) {
		long num = source;
		long add = source;

		while (num <= A)
			num += (add *= 10);

		return (int) num;
	}

}
