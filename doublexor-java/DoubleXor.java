/*
 * SRM454-D1-250
 * SOLVED
 */

public class DoubleXor {

	public int calculate(int N) {
		char[] cur = String.valueOf(N).toCharArray();
		char[] xor = new char[cur.length];

		for (int i = 0; i < cur.length; ++i) {
			cur[i] -= '0';
			xor[i] = 0;
		}

		while (!zero(cur)) {
			for (int i = 0; i < xor.length; ++i)
				xor[i] = (char) ((xor[i] ^ cur[i]) % 10);

			dec(cur);
		}

		for (int i = 0; i < cur.length; ++i)
			xor[i] += '0';

		return Integer.valueOf(new String(xor));
	}

	private void dec(char[] xor) {
		int i = xor.length - 1;
		while (xor[i] == 0)
			xor[i--] = 9;

		xor[i]--;
	}

	private boolean zero(char[] xor) {
		for (char c : xor)
			if (c != 0)
				return false;

		return true;
	}

}
