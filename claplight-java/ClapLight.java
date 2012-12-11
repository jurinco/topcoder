/*
 * SRM196-D1-250
 * SOLVED
 */

public class ClapLight {

	public int threshold(int[] background) {
		for (int l = 0; l < 1000; ++l) {
			if (lowCount(background, l) * 2 > background.length && !willTrigger(background, l))
				return l;
		}

		return 1001;
	}

	private boolean willTrigger(int[] background, int l) {
		for (int i = 0; i < background.length - 3; ++i)
			if (background[i] < l && background[i + 1] >= l && background[i + 2] >= l && background[i + 3] < l)
				return true;

		return false;
	}

	private int lowCount(int[] background, int l) {
		int low = 0;
		for (int v : background)
			if (v < l)
				low++;
		return low;
	}

}
