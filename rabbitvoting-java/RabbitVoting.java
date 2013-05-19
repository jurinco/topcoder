/*
 * SRM475-D2-250
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class RabbitVoting {

	public String getWinner(String[] names, String[] votes) {
		HashMap<String, Integer> res = new HashMap<String, Integer>();

		for (String name : names)
			res.put(name, 0);

		for (int i = 0; i < names.length; ++i)
			if (!names[i].equals(votes[i]))
				res.put(votes[i], res.get(votes[i]) + 1);

		int max = 0;
		for (int v : res.values())
			max = max(v, max);

		String win = null;
		for (String name : names)
			if (res.get(name) == max) {
				if (win != null)
					return "";
				win = name;
			}

		return win;
	}

}
