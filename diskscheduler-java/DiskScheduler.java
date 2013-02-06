/*
 * SRM194-D2-1000
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class DiskScheduler {

	public int optimize(int start, int[] sectors) {
		for (int i = 0; i < sectors.length; ++i)
			sectors[i] = (sectors[i] - start + 100) % 100;

		Arrays.sort(sectors);

		int min = min(sectors[sectors.length - 1], 100 - sectors[0]);

		for (int i = 1; i < sectors.length; ++i)
			min = min(min, sectors[i - 1] + (100 - sectors[i]) + min(sectors[i - 1], 100 - sectors[i]));

		return min;
	}

}
