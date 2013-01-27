package coords;

import java.util.Comparator;

/**
 * Comparator for integer arrays as 2d coords
 */
public class Arrays {

	public static final Comparator<int[]> COORD_COMPARATOR = new Comparator<int[]>() {

		public int compare(int[] o1, int[] o2) {
			for (int i = 0; i < o1.length; ++i) {
				if (o1[i] < o2[i])
					return -1;
				if (o1[i] > o2[i])
					return 1;
			}

			return 0;
		}

	};

}
