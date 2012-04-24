/*
 * SRM147-D2-950
 * UNSOLVED
 */

import java.util.*;

public class GoldenChain {

	public int minCuts(int[] sections) {
		Arrays.sort(sections);

		int connectors = 0;
		int chains = sections.length;

		for (int i = 0; i < sections.length; ++i) {
			int section = sections[i];

			if (connectors + section > chains - 1)
				return chains;

			connectors += section;
			chains--;
		}

		return -1;
	}

}
