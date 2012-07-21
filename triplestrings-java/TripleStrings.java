/*
 * TCO11-O1-250
 * SOLVED
 */

public class TripleStrings {

	public int getMinimumOperations(String init, String goal) {
		for (int i = 0; i < init.length(); ++i)
			if (goal.startsWith(init.substring(i)))
				return 2 * i;

		return 2 * init.length();
	}

}
