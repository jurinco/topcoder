/*
 * SRM150-D2-1100
 * UNSOLVED
 */

public class BrickByBrick {

	class Pos implements Cloneable {
		public int x, y, d;

		public boolean equals(Object o) {
			if (o == null)
				return false;
			Pos s = (Pos) o;
			return x == s.x && y == s.y && d == s.d;
		}

		public Pos clone() {
			Pos np = new Pos();
			np.x = x;
			np.y = y;
			np.d = d;
			return np;
		}

		public String toString() {
			return "{" + x + "," + y + "," + d + "}";
		}
	}

	class State {
		private char[][] data;
		private int w, h, blockCount;
		public boolean bounced, destroyed;

		public State(String[] map) {
			bounced = false;
			destroyed = false;
			w = map[0].length();
			h = map.length;
			data = new char[w][h];
			blockCount = 0;

			for (int y = 0; y < h; ++y) {
				String row = map[y];

				for (int x = 0; x < w; ++x) {
					data[x][y] = row.charAt(x);

					if (row.charAt(x) == 'B')
						blockCount++;
				}
			}
		}

		public boolean bounce(int x, int y) {
			bounced = true;
			destroyed = false;

			if (x < 0 || y < 0 || x >= w || y >= h)
				return true;

			if (data[x][y] == 'B') {
				data[x][y] = '.';
				blockCount--;
				destroyed = true;
				return true;
			}

			if (data[x][y] == '.') {
				bounced = false;
				return false;
			}

			return true;
		}
	}

	static final int TR = 1;
	static final int RB = 2;
	static final int BL = 3;
	static final int LT = 4;
	static final int RT = 5;
	static final int TL = 6;
	static final int LB = 7;
	static final int BR = 8;

	public int timeToClear(String[] map) {
		int time = 0;
		State s = new State(map);
		Pos wall = null;
		Pos cur = new Pos();
		cur.x = 0;
		cur.y = 0;
		cur.d = TR;

		while (s.blockCount > 0 && !cur.equals(wall)) {
			if (s.destroyed)
				wall = null;
			else if (s.bounced && wall == null)
				wall = (Pos) cur.clone();

			time++;

			switch (cur.d) {
			case TR:
				if (s.bounce(cur.x + 1, cur.y)) {
					cur.d = RB;
				} else {
					cur.x++;
					cur.d = LB;
				}
				break;
			case BR:
				if (s.bounce(cur.x + 1, cur.y)) {
					cur.d = RT;
				} else {
					cur.x++;
					cur.d = LT;
				}
				break;
			case TL:
				if (s.bounce(cur.x - 1, cur.y)) {
					cur.d = LB;
				} else {
					cur.x--;
					cur.d = RB;
				}
				break;
			case BL:
				if (s.bounce(cur.x - 1, cur.y)) {
					cur.d = LT;
				} else {
					cur.x--;
					cur.d = RT;
				}
				break;
			case RT:
				if (s.bounce(cur.x, cur.y - 1)) {
					cur.d = TL;
				} else {
					cur.y--;
					cur.d = BL;
				}
				break;
			case LT:
				if (s.bounce(cur.x, cur.y - 1)) {
					cur.d = TR;
				} else {
					cur.y--;
					cur.d = BR;
				}
				break;
			case RB:
				if (s.bounce(cur.x, cur.y + 1)) {
					cur.d = BL;
				} else {
					cur.y++;
					cur.d = TL;
				}
				break;
			case LB:
				if (s.bounce(cur.x, cur.y + 1)) {
					cur.d = BR;
				} else {
					cur.y++;
					cur.d = TR;
				}
				break;
			}
		}

		return s.blockCount == 0 ? time : -1;
	}

}
