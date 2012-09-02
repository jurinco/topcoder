/*
 * SRM451-D2-250
 * SOLVED
 */

import java.util.*;

public class BoredPhilosophers {

	public int[] simulate(String[] text, int N) {
		String[] words = words(text);
		int[] res = new int[N];

		for (int i = 0; i < N; ++i)
			res[i] = countSeqs(words, i);

		return res;
	}

	private String[] words(String[] parts) {
		StringBuilder text = new StringBuilder();

		for (String p : parts)
			text.append(p);

		return text.toString().split(" ");
	}

	private int countSeqs(String[] words, int len) {
		HashSet<String> seqs = new HashSet<String>();
		StringBuilder b = new StringBuilder();

		for (int j = 0; j < words.length - len; ++j) {
			b.setLength(0);

			for (int k = j; k <= j + len; ++k) {
				b.append(words[k]);
				b.append(' ');
			}

			seqs.add(b.toString());
		}

		return seqs.size();
	}

}
