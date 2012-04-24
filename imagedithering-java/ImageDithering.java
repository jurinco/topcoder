/*
 * SRM145-D2-250
 * SOLVED
 */

public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int w = screen[0].length();
		int h = screen.length;
		int count = 0;

		for (int y = 0; y < h; ++y) {
			String row = screen[y];

			for (int x = 0; x < w; ++x)
				if (dithered.indexOf(row.charAt(x)) >= 0)
					count++;
		}

		return count;
	}

}
