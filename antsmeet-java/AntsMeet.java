/*
 * SRM541-D1-250
 * SOLVED
 */

import java.util.*;

public class AntsMeet {

	final static int L = 2000;

	public int countAnts(int[] x, int[] y, String direction) {
		for (int i = 0; i < x.length; ++i) {
			x[i] *= 2;
			y[i] *= 2;
		}

		BitSet met = new BitSet();
		BitSet outer = new BitSet();

		while (met.cardinality() + outer.cardinality() < x.length) {
			for (int i = 0; i < x.length; ++i)
				if (!met.get(i) && !outer.get(i)) {
					switch (direction.charAt(i)) {
					case 'N':
						y[i]++;
						break;
					case 'S':
						y[i]--;
						break;
					case 'W':
						x[i]--;
						break;
					case 'E':
						x[i]++;
						break;
					}

					if (x[i] > L || x[i] < -L || y[i] > L || y[i] < -L)
						outer.set(i);
				}

			for (int i = 0; i < x.length; ++i)
				if (!outer.get(i))
					for (int j = 0; j < i; ++j)
						if (!outer.get(j)) {
							if (x[i] == x[j] && y[i] == y[j]) {
								met.set(i);
								met.set(j);
							}
						}

			for (int i = 0; i < x.length; ++i)
				if (met.get(i)) {
					x[i] = -10000;
					y[i] = -10000;
				}
		}

		return outer.cardinality();
	}

}
