/*
 * SRM470-D2-500
 * SRM470-D1-250
 * SOLVED
 */

import java.util.*;

public class DoorsGame {

	public int determineOutcome(String doors, int trophy) {
		Set<Character> common = new HashSet<Character>();
		Set<Character> left = new HashSet<Character>();
		Set<Character> right = new HashSet<Character>();

		for (int i = 0; i < trophy; ++i)
			left.add(doors.charAt(i));

		for (int i = trophy; i < doors.length(); ++i)
			right.add(doors.charAt(i));

		common.addAll(left);
		common.retainAll(right);

		left.removeAll(common);
		right.removeAll(common);

		if (left.size() + common.size() <= right.size())
			return (left.size() + common.size()) * 2 - 1;

		if (left.size() <= right.size() + common.size())
			return 0;

		return -(right.size() + common.size()) * 2;
	}

}
