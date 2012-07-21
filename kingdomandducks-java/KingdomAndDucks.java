/*
 * SRM548-D2-250
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class KingdomAndDucks {

	public int minDucks(int[] duckTypes) {
		Map<Integer, Integer> typesWithSize = new HashMap<Integer, Integer>();

		for (int duck : duckTypes) {
			Integer old = typesWithSize.get(duck);
			typesWithSize.put(duck, old == null ? 1 : old + 1);
		}

		int typeCount = typesWithSize.size();
		int typeSize = 0;

		for (Integer size : typesWithSize.values())
			typeSize = max(typeSize, size);

		return typeCount * typeSize;
	}

}
