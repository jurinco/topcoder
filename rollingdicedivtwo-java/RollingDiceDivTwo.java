/*
 * SRM536-D2-500
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class RollingDiceDivTwo {

	public int minimumFaces(String[] rolls) {
		int[][] obs = new int[rolls.length][];

		for (int i = 0; i < rolls.length; ++i)
			obs[i] = sort(rolls[i]);

		int s = 0;
		for (int i = 0; i < obs[0].length; ++i) {
			int m = 0;
			for (int j = 0; j < obs.length; ++j)
				m = max(m, obs[j][i]);

			s += m;
		}

		return s;
	}

	private int[] sort(String string) {
		int[] obs = new int[string.length()];

		for (int i = 0; i < obs.length; ++i)
			obs[i] = string.charAt(i) - '0';

		Arrays.sort(obs);

		return obs;
	}

}
