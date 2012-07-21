/*
 * SRM154-D2-1000
 * SOLVED
 */

import java.util.*;

public class ContestScore {

	class Group {

		public String name;
		public int[] scores;
		public int[] ranks;

		public int totalScore() {
			int sum = 0;
			for (int s : scores)
				sum += s;
			return sum;
		}

		public int totalRank() {
			int sum = 0;
			for (int r : ranks)
				sum += r;
			return sum;
		}

	}

	public String[] sortResults(String[] data) {
		if (data.length == 0)
			return new String[0];

		Group[] groups = new Group[data.length];

		for (int i = 0; i < data.length; ++i) {
			String[] p = data[i].split(" ");
			Group g = new Group();

			g.name = p[0];
			g.scores = new int[p.length - 1];
			g.ranks = new int[p.length - 1];

			for (int j = 0; j < p.length - 1; ++j) {
				g.scores[j] = (int) (Double.valueOf(p[j + 1]) * 10);
			}

			groups[i] = g;
		}

		for (int i = 0; i < groups[0].scores.length; ++i)
			buildRanks(groups, i);

		Arrays.sort(groups, new Comparator<Group>() {

			public int compare(Group g1, Group g2) {
				if (g1.totalRank() != g2.totalRank())
					return g1.totalRank() - g2.totalRank();

				if (g1.totalScore() != g2.totalScore())
					return g2.totalScore() - g1.totalScore();

				return g1.name.compareTo(g2.name);
			}

		});

		String[] res = new String[data.length];

		for (int i = 0; i < data.length; ++i) {
			res[i] = groups[i].name + " " + groups[i].totalRank() + " " + (groups[i].totalScore() / 10.0);
		}

		return res;
	}

	private void buildRanks(Group[] groups, final int ind) {
		Group[] ranked = groups.clone();

		Arrays.sort(ranked, new Comparator<Group>() {

			public int compare(Group g1, Group g2) {
				return g2.scores[ind] - g1.scores[ind];
			}

		});

		int prevRank = 0;
		double prevScore = Double.POSITIVE_INFINITY;

		for (int i = 0; i < ranked.length; ++i) {
			if (ranked[i].scores[ind] == prevScore) {
				ranked[i].ranks[ind] = prevRank;
			} else {
				ranked[i].ranks[ind] = prevRank = i + 1;
				prevScore = ranked[i].scores[ind];
			}
		}
	}
}
