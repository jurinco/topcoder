/*
 * SRM436-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FriendScore {

	public int highestScore(String[] friends) {
		int maxScore = 0;

		for (int i = 0; i < friends.length; ++i) {
			int score = 0;

			for (int j = 0; j < friends.length; ++j)
				if (isFriends2(i, j, friends))
					score++;

			maxScore = max(score, maxScore);
		}
		return maxScore;
	}

	private boolean isFriends2(int i, int j, String[] friends) {
		if (i == j)
			return false;

		if (friends[i].charAt(j) == 'Y')
			return true;

		for (int k = 0; k < friends.length; ++k)
			if (friends[i].charAt(k) == 'Y' && friends[k].charAt(j) == 'Y')
				return true;

		return false;
	}

}
