/*
 * SRM574-D2-250
 * SOLVED
 */

import java.util.*;

public class CityMap {

	public String getLegend(String[] cityMap, int[] POIs) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

		int w = cityMap[0].length();
		int h = cityMap.length;

		for (int y = 0; y < h; ++y) {
			String row = cityMap[y];

			for (int x = 0; x < w; ++x) {
				if (row.charAt(x) != '.') {
					Integer v = counts.get(row.charAt(x));
					counts.put(row.charAt(x), v == null ? 1 : v + 1);
				}
			}
		}

		HashMap<Integer, Character> names = new HashMap<Integer, Character>();

		for (Map.Entry<Character, Integer> e : counts.entrySet())
			names.put(e.getValue(), e.getKey());

		char[] legend = new char[POIs.length];
		for (int i = 0; i < POIs.length; ++i)
			legend[i] = names.get(POIs[i]);

		return new String(legend);
	}

}
