/*
 * SRM541-D1-550
 * SOLVED
 */

public class AkariDaisukiDiv1 {

	long M = 1000000007;

	public int countF(String W, String A, String D, String S, String F, int k) {
		while (k > 0 && S.length() < F.length()) {
			S = W + S + A + S + D;
			k--;
		}

		long count = 0;

		for (int i = 0; i <= S.length() - F.length(); ++i)
			if (S.startsWith(F, i))
				count++;

		if (k == 0)
			return (int) count;

		String pre = S.substring(0, F.length());
		String pos = S.substring(S.length() - F.length());
		long add = 0;

		for (int c = 0; c < F.length() && k > 0; ++c) {
			String newPre = W + pre;
			String newPos = pos + D;
			add = 0;

			for (int i = 0; i < W.length(); ++i)
				if (newPre.startsWith(F, i))
					add++;

			for (int i = 0; i < D.length(); ++i)
				if (newPos.startsWith(F, newPos.length() - F.length() - i))
					add++;

			String mid = pos + A + pre;

			for (int o = pos.length() - F.length() + 1; o < pos.length() + A.length(); ++o)
				if (mid.startsWith(F, o))
					add++;

			pre = newPre.substring(0, F.length());
			pos = newPos.substring(newPos.length() - F.length());
			count = (count + count + add) % M;

			k--;
		}

		while (k > 0) {
			count = (count + count + add) % M;
			k--;
		}

		return (int) (count % M);
	}

}
