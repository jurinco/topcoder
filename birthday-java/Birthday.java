/*
 * SRM151-D2-500
 * SOLVED
 */

import java.util.*;

public class Birthday {

	public String getNext(String date, String[] birthdays) {
		Arrays.sort(birthdays);

		for (String b : birthdays)
			if (b.compareTo(date) >= 0)
				return b.split(" ")[0];

		return birthdays[0].split(" ")[0];
	}

}
