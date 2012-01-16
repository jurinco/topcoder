import static java.lang.Math.*;

public class P8XGraphBuilder {

	public int solve(int[] scores) {
		int[][] maxScores = new int[scores.length + 1][scores.length + 1]; // maxScores[count-1][degree-1]

		maxScores[0][0] = scores[0]; // Graphset from one node

		for (int n = 1; n < scores.length; ++n) {
			maxScores[n][0] = joinScore(scores, maxScores, n);

			for (int d = 1; d <= n; ++d)
				maxScores[n][d] = unionScore(maxScores, n, d);
		}

		int ms = 0;
		for (int d = 0; d < scores.length; ++d)
			ms = max(ms, maxScores[scores.length - 1][d] + scores[d]);

		return ms;
	}

	private int joinScore(int[] scores, int[][] maxScores, int n) {
		int ms = 0;

		for (int d = 0; d < n; ++d)
			ms = max(ms, maxScores[n - 1][d] + scores[d + 1]);

		return ms;
	}

	private int unionScore(int[][] maxScores, int n, int d) {
		int ms = 0;

		for (int pn = 0; pn < n; ++pn)
			if (d - 1 <= n - pn - 1)
				ms = max(ms, maxScores[n - pn - 1][d - 1] + maxScores[pn][0]);
		return ms;
	}

}
