/*
 * SRM544-D1-500
 * SOLVED
 */

public class TheBrickTowerMediumDivOne {

	public int[] find(int[] heights) {
		int[] indexes = new int[heights.length];

		for (int i = 0; i < heights.length; ++i)
			indexes[i] = i;

		synsort(heights, indexes);

		int ch = Integer.MAX_VALUE;
		for (int i = 0; i < heights.length; ++i) {

			int ni = Integer.MAX_VALUE;
			int nh = Integer.MAX_VALUE;
			int nj = -1;

			for (int j = i; j < heights.length; ++j)
				if (heights[j] <= ch && indexes[j] < ni) {
					ni = indexes[j];
					nh = heights[j];
					nj = j;
				}

			if (nj < 0)
				break;

			for (int j = nj; j > i; --j) {
				indexes[j] = indexes[j - 1];
				heights[j] = heights[j - 1];
			}

			indexes[i] = ni;
			heights[i] = nh;

			ch = nh;

		}

		return indexes;
	}

	private void arswap(int[] arr, int a, int b) {
		int v = arr[a];
		arr[a] = arr[b];
		arr[b] = v;
	}

	private void synsort(int[] a1, int[] a2) {
		for (int i = 0; i < a1.length; ++i)
			for (int j = 1; j < a1.length; ++j)
				if (a1[j] < a1[j - 1]) {
					arswap(a2, j - 1, j);
					arswap(a1, j - 1, j);
				}
	}
}
