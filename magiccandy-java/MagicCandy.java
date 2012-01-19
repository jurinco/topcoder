/*
 * SRM526.5D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class MagicCandy {

	public int whichOne(int n) {
		int i = n;
		while (n > 1) {
			int sn = (int) sqrt(n);
			
			if (sn*sn == n)
				i--;
			
			n -= sn;			
		}

		return i;
	}

}
