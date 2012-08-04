/*
 * SRM523-D2-250
 * SOLVED
 */

public class AlphabetPath {

	public String doesItExist(String[] letterMaze) {
		int cx = -1;
		int cy = -1;
		char c = 'A';

		int w = letterMaze[0].length();
		int h = letterMaze.length;

		for (int y = 0; y < h; ++y) {
			String row = letterMaze[y];

			for (int x = 0; x < w; ++x)
				if (row.charAt(x) == c) {
					cx = x;
					cy = y;
					break;
				}

			if (cx >= 0 && cy >= 0)
				break;
		}

		while (c < 'Z') {
			c++;

			if (cx > 0 && letterMaze[cy].charAt(cx - 1) == c)
				cx--;
			else if (cx < w - 1 && letterMaze[cy].charAt(cx + 1) == c)
				cx++;
			else if (cy > 0 && letterMaze[cy - 1].charAt(cx) == c)
				cy--;
			else if (cy < h - 1 && letterMaze[cy + 1].charAt(cx) == c)
				cy++;
			else
				return "NO";
		}

		return "YES";
	}

}
