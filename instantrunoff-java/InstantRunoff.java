/*
 * SRM175-D1-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class InstantRunoff {

	public String outcome(String candidates, String[] ballots) {
		HashSet<Character> active = new HashSet<Character>();

		for (char c : candidates.toCharArray())
			active.add(c);

		while (active.size() > 1) {
			int[] votes = new int['Z' - 'A' + 1];

			for (String b : ballots)
				votes[selection(b, active) - 'A']++;

			int minvote = Integer.MAX_VALUE;
			for (int i = 0; i < votes.length; ++i)
				if (active.contains((char)(i + 'A')))
					minvote = min(minvote, votes[i]);

			for (int i = 0; i < votes.length; ++i)
				if (votes[i] == minvote)
					active.remove((char)(i + 'A'));
		}

		if (active.isEmpty())
			return "";
		else
			return "" + active.iterator().next();
	}

	private char selection(String b, Set<Character> active) {
		for (int i = 0; i < b.length(); ++i)
			if (active.contains(b.charAt(i)))
				return b.charAt(i);

		return 0;
	}

}
