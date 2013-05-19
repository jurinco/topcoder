/*
 * SRM575-D1-500
 * SOLVED
 */

public class TheSwapsDivOne {

	public double find(String[] sequence, int k) {
		int count = 0;
		int sum = 0;
		for (String s : sequence)
			for (char c : s.toCharArray()) {
				count++;
				sum += c - '0';
			}

		double cp = 0.0;

		for (int i = 0; i < k; ++i)
			cp = cp + (1 - cp) * 2.0 / (count - 1);

		double[] exp = new double[count];
		{
			int i = 0;
			for (String s : sequence)
				for (char c : s.toCharArray())
					exp[i++] = (c - '0') * (1 - cp) + cp * sum / count;
		}

		double[] expsumpref = new double[count + 1];
		expsumpref[0] = 0;
		for (int i = 0; i < count; ++i)
			expsumpref[i + 1] = expsumpref[i] + exp[i];

		double expsum = 0;
		for (int i = 0; i < count; ++i)
			for (int j = i; j < count; ++j)
				expsum += expsumpref[j + 1] - expsumpref[i];

		long scount = count * (count + 1) / 2;

		return expsum / scount;
	}
}
