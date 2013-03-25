/*
 * SRM571-D1-500
 * UNSOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class MagicMolecule {

	public int maxMagicPower(int[] magicPower, String[] magicBond) {
		int[][] powers = new int[magicPower.length][magicPower.length];
		BitSet[][] members = new BitSet[magicPower.length][magicPower.length];

		for (int i = 0; i < members.length; ++i)
			for (int j = 0; j < members.length; ++j) {
				powers[i][j] = -1;
				members[i][j] = null;
			}

		for (int m = 0; m < members.length; ++m) {
			powers[0][m] = magicPower[m];
			members[0][m] = new BitSet();
			members[0][m].set(m);
		}

		for (int i = 1; i < members.length; ++i) {
			for (int m = i; m < members[i].length; ++m) {
				int bp = -1, bm = -1;

				for (int pm = i - 1; pm < m; ++pm)
					if (powers[i - 1][pm] > bp && connected(m, members[i - 1][pm], magicBond)) {
						bp = powers[i - 1][pm];
						bm = pm;
					}

				if (bp >= 0) {
					powers[i][m] = bp + magicPower[m];
					members[i][m] = (BitSet) members[i - 1][bm].clone();
					members[i][m].set(m);
				}
			}
		}

		int max = -1;

		for (int i = 0; i < members.length; ++i)
			if (3 * (i + 1) >= members.length * 2)
				for (int m = i; m < members.length; ++m)
					max = max(max, powers[i][m]);

		return max;
	}

	private boolean connected(int m, BitSet verts, String[] magicBond) {
		for (int i = 0; i < magicBond.length; ++i)
			if (verts.get(i) && magicBond[i].charAt(m) == 'N')
				return false;

		return true;
	}

}
