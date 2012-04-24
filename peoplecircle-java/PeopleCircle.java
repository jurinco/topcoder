/*
 * SRM147-D2-600
 * SOLVED
 */

import java.util.*;

public class PeopleCircle {

	public String order(int numMales, int numFemales, int K) {
		ArrayList<Integer> indices = new ArrayList<Integer>();

		for (int i = 0; i < numMales + numFemales; ++i)
			indices.add(i);

		int current = 0;
		for (int i = 0; i < numFemales; ++i) {
			current = (current + K - 1) % indices.size();
			indices.remove(current);
		}

		StringBuilder b = new StringBuilder();

		for (int i = 0; i < numMales + numFemales; ++i)
			b.append(indices.contains(i) ? 'M' : 'F');

		return b.toString();
	}

}
