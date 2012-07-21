/*
 * SRM449-D2-1000
 * SOLVED
 * UGLY
 */

import java.util.*;

public class HexagonalBattlefieldEasy {

	private final HashMap<BitSet, Integer> cache = new HashMap<BitSet, Integer>();

	public int countArrangements(int[] X, int[] Y, int N) {
		int ofs = N - 1;
		int sz = (2 * N - 1);
		int cnt = 0;
		int[] cellMap = new int[sz * sz];
		int[] cellX = new int[sz * sz];
		int[] cellY = new int[sz * sz];

		Arrays.fill(cellMap, -1);

		for (int y = 1 - N; y < 0; ++y) {
			for (int x = 1 - N; x <= N + y - 1; ++x) {
				cellY[cnt] = y;
				cellX[cnt] = x;
				cellMap[sz * (ofs + y) + x + ofs] = cnt++;
			}
		}

		for (int x = 1 - N; x < N; ++x) {
			cellY[cnt] = 0;
			cellX[cnt] = x;
			cellMap[sz * ofs + x + ofs] = cnt++;
		}

		for (int y = 1; y < N; ++y) {
			for (int x = 1 + y - N; x <= N - 1; ++x) {
				cellY[cnt] = y;
				cellX[cnt] = x;
				cellMap[sz * (ofs + y) + x + ofs] = cnt++;
			}
		}

		BitSet state = new BitSet(cnt);
		state.set(0, cnt);

		for (int i = 0; i < X.length; ++i)
			state.clear(cellMap[sz * (ofs + Y[i]) + ofs + X[i]]);

		return count(state, cellMap, cellX, cellY, sz, ofs);
	}

	private int count(BitSet state, int[] cellMap, int[] cellX, int[] cellY, int sz, int ofs) {
		if (state.isEmpty())
			return 1;

		Integer val = cache.get(state);

		if (val != null)
			return val;

		val = 0;

		int cur = findSet(state);

		int curX = cellX[cur];
		int curY = cellY[cur];

		if (curY + 1 + ofs < sz)
			val += countNext(state, cellMap, cellX, cellY, sz, ofs, cur, cellMap[sz * (curY + 1 + ofs) + curX + ofs]);

		if (curX + 1 + ofs < sz)
			val += countNext(state, cellMap, cellX, cellY, sz, ofs, cur, cellMap[sz * (curY + ofs) + curX + 1 + ofs]);
		if (curX + 1 + ofs < sz && curY + 1 + ofs < sz)
			val += countNext(state, cellMap, cellX, cellY, sz, ofs, cur, cellMap[sz * (curY + 1 + ofs) + curX + 1 + ofs]);

		cache.put((BitSet) state.clone(), val);
		return val;
	}

	private int countNext(BitSet state, int[] cellMap, int[] cellX, int[] cellY, int sz, int ofs, int cur, int next) {
		int dif = 0;

		if (next >= 0 && state.get(next)) {
			state.clear(cur);
			state.clear(next);
			dif += count(state, cellMap, cellX, cellY, sz, ofs);
			state.set(cur);
			state.set(next);
		}

		return dif;
	}

	private int findSet(BitSet state) {
		for (int i = 0; i < state.size(); ++i)
			if (state.get(i))
				return i;
		throw new IllegalStateException();
	}
}
