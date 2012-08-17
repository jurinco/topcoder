/*
 * SRM551-D2-250
 * SOLVED
 */

import java.util.*;

public class ColorfulBricks {

	public int countLayouts(String bricks) {
		HashSet<Character> colors = new HashSet<Character>();

		for (int i = 0; i < bricks.length(); ++i)
			colors.add(bricks.charAt(i));

		if (colors.size() == 1)
			return 1;
		else if (colors.size() == 2)
			return 2;
		else
			return 0;
	}

}
