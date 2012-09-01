/*
 * SRM157-D2-1000
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class HourGlass {

	private static class State implements Comparable<State> {

		public final int time;
		public final int first;
		public final int second;

		public State(int time, int first, int second) {
			this.time = time;
			this.first = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "{" + time + "," + first + ", " + second + "}";
		}

		public int compareTo(State p) {
			int r = time - p.time;

			if (r == 0)
				r = first - p.first;

			return r == 0 ? second - p.second : r;
		}

		@Override
		public int hashCode() {
			return 11 * time + 13 * first + second;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;

			State other = (State) obj;
			return time == other.time && first == other.first && second == other.second;
		}

	}

	public int[] measurable(int first, int second) {
		PriorityQueue<State> queue = new PriorityQueue<State>();
		int[] results = new int[10];
		int count = 0;

		queue.add(new State(0, first, 0));
		queue.add(new State(0, 0, second));
		queue.add(new State(0, first, second));

		while (count < 10) {
			State s = queue.poll();

			if (s.time > 0 && (count == 0 || results[count - 1] < s.time))
				results[count++] = s.time;

			int minw = min(s.first, s.second);
			int maxw = max(s.first, s.second);

			if (minw > 0) {
				queue.add(new State(s.time + minw, first - s.first + minw, s.second - minw));
				queue.add(new State(s.time + minw, first - s.first + minw, second - s.second + minw));
				queue.add(new State(s.time + minw, s.first - minw, second - s.second + minw));
			}

			if (maxw > minw) {
				queue.add(new State(s.time + maxw, first - max(s.first - maxw, 0), max(s.second - maxw, 0)));
				queue.add(new State(s.time + maxw, max(s.first - maxw, 0), second - max(s.second - maxw, 0)));
				queue.add(new State(s.time + maxw, first - max(s.first - maxw, 0), second - max(s.second - maxw, 0)));
			}
		}

		return results;
	}

}
