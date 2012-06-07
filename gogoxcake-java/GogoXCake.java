/*
 * SRM530-D1-250
 * SOLVED
 * UGLY
 */

public class GogoXCake {

	class Point {
		public int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + ":" + y;
		}

	}

	public String solve(String[] cakeS, String[] cutter) {
		char[][] cake = new char[cakeS.length][cakeS[0].length()];
		int w = cakeS[0].length();
		int h = cakeS.length;
		int count = 0;
		for (int y = 0; y < h; ++y) {
			String row = cakeS[y];

			for (int x = 0; x < w; ++x) {
				cake[y][x] = row.charAt(x);

				if (row.charAt(x) == '.')
					count++;
			}
		}

		int cutterSize = countCutterSize(cutter);

		return count % cutterSize == 0 && solve(cake, count, cutter, cutterSize) ? "YES" : "NO";
	}

	private int countCutterSize(String[] cutter) {
		int cutterSize = 0;
		int w = cutter[0].length();
		int h = cutter.length;

		for (int y = 0; y < h; ++y) {
			String row = cutter[y];

			for (int x = 0; x < w; ++x) {
				if (row.charAt(x) == '.')
					cutterSize++;
			}
		}
		return cutterSize;
	}

	private boolean solve(char[][] cake, int emptyCount, String[] cutter, int cutterSize) {
		if (emptyCount == 0)
			return true;

		for (int ox = 0; ox <= cake[0].length - cutter[0].length(); ++ox)
			for (int oy = 0; oy <= cake.length - cutter.length; ++oy) {
				Point[] p = match(cake, cutter, cutterSize, ox, oy);

				if (p != null) {
					try {
						unapply(cake, p);
						return solve(cake, emptyCount - cutterSize, cutter, cutterSize);
					} finally {
						apply(cake, p);
					}
				}
			}

		return false;
	}

	private Point[] match(char[][] cake, String[] cutter, int cutterSize, int ox, int oy) {
		int i = 0;
		Point[] res = new Point[cutterSize];
		int w = cutter[0].length();
		int h = cutter.length;

		for (int y = 0; y < h; ++y) {
			String row = cutter[y];

			for (int x = 0; x < w; ++x) {
				if (row.charAt(x) == '.') {
					if (cake[y + oy][x + ox] == '.') {
						res[i++] = new Point(x + ox, y + oy);
					} else {
						return null;
					}
				}
			}
		}
		return res;
	}

	private void apply(char[][] cake, Point[] pp) {
		for (Point p : pp) {
			cake[p.y][p.x] = '.';
		}

	}

	private void unapply(char[][] cake, Point[] pp) {
		for (Point p : pp) {
			cake[p.y][p.x] = 'X';
		}

	}

}
