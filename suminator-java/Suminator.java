/*
 * SRM553-D1-250
 * SOLVED
 */

import java.util.Stack;

public class Suminator {

	static class Value {

		public final long c;
		public final boolean m;

		public Value(long c, boolean m) {
			this.c = c;
			this.m = m;
		}

		public Value add(Value v) {
			return new Value(c + v.c, m || v.m);
		}
	}

	public int findMissing(int[] program, int wantedResult) {
		if (withZero(program) == wantedResult)
			return 0;

		Value v = withValue(program);

		if (v.m && v.c < wantedResult) {
			return (int) (wantedResult - v.c);
		} else if (!v.m && v.c == wantedResult) {
			return 1;
		}

		return -1;
	}

	private Value withValue(int[] program) {
		Stack<Value> stack = new Stack<Value>();

		for (int op : program)
			if (op > 0) {
				stack.push(new Value(op, false));
			} else if (op < 0) {
				stack.push(new Value(0, true));
			} else {
				Value v1 = stack.isEmpty() ? new Value(0, false) : stack.pop();
				Value v2 = stack.isEmpty() ? new Value(0, false) : stack.pop();
				stack.push(v1.add(v2));
			}

		return stack.pop();
	}

	private long withZero(int[] program) {
		Stack<Long> stack = new Stack<Long>();

		for (int op : program)
			if (op > 0) {
				stack.push((long) op);
			} else {
				long v1 = stack.isEmpty() ? 0L : stack.pop();
				long v2 = stack.isEmpty() ? 0L : stack.pop();
				stack.push(v1 + v2);
			}

		return stack.pop();
	}

}
