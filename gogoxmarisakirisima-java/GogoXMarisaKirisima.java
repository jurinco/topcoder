/*
 * SRM530-D1-500
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class GogoXMarisaKirisima {

	public int solve(String[] choices) {
		return countPaths1(0, choices.length - 1, buildMatrix(choices));
	}

	private List<Set<String>> findPaths(int i, int j, boolean[][] buildMatrix) {

		return findPaths(i, j, buildMatrix, new ArrayList<Set<String>>(), new ArrayList<String>());
	}

	private int countPaths1(int start, int end, boolean[][] matrix) {
		int[] counts = new int[matrix.length];

		counts[end] = 1;

		boolean changed = true;
		while (changed) {
			changed = false;

			for (int i = 0; i < matrix.length; ++i)
				for (int j = 0; j < matrix.length; ++j)
					if (matrix[i][j] && counts[j] > 0) {
						counts[i] += counts[j];
						matrix[i][j] = false;
						changed = true;
					}
		}

		return counts[start];
	}

	private List<Set<String>> findPaths(int start, int end, boolean[][] matrix, List<Set<String>> set, ArrayList<String> cur) {
		if (start == end) {
			Set<String> cs = new HashSet<String>();
			cs.addAll(cur);
			set.add(cs);
		}

		for (int i = 0; i < matrix.length; ++i) {
			if (matrix[start][i] && count(cur, start + " " + i) <= 1) {
				try {
					cur.add(start + " " + i);
					findPaths(i, end, matrix, set, cur);
				} finally {
					cur.remove(cur.size() - 1);
				}
			}
		}

		return set;
	}

	private int count(ArrayList<String> cur, String string) {
		int c = 0;
		for (String s : cur)
			if (s.equals(string))
				++c;
		return c;
	}

	private int countPaths(List<Set<String>> paths) {
		return countPaths(paths, new HashSet<Set<String>>(), new HashSet<String>());
	}

	private int countPaths(List<Set<String>> paths, Set<Set<String>> used, HashSet<String> last) {
		int r = 0;
		for (Set<String> p : paths) {
			if (!used.contains(p) && more(p, last)) {
				HashSet<String> u = (HashSet<String>) last.clone();
				u.addAll(p);
				try {
					used.add(p);
					r = max(r, countPaths(paths, used, u) + 1);
				} finally {
					used.remove(p);
				}
			}
		}

		return r;
	}

	private boolean more(Set<String> p, Set<String> last) {
		return !last.containsAll(p);
	}

	private boolean[][] buildMatrix(String[] choices) {
		boolean[][] graph = new boolean[choices.length][choices[0].length()];

		int w = choices[0].length();
		int h = choices.length;

		for (int y = 0; y < h; ++y) {
			String row = choices[y];

			for (int x = 0; x < w; ++x) {
				graph[y][x] = row.charAt(x) == 'Y';
			}
		}
		return graph;
	}

}
