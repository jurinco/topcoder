/*
 * SRM469-D2-900
 * SOLVED
 */

public class TheMoviesLevelThreeDivTwo {

	public int find(int[] timeJ, int[] timeB) {
		int maxOrder = 1 << timeJ.length;
		int res = 0;

		for (int order = 0; order < maxOrder; ++order)
			if (goodOrder(order, timeJ, timeB))
				res++;

		return res;
	}

	private boolean goodOrder(int order, int[] timeJ, int[] timeB) {
		int jtq = 0, btq = 0; // Times where reviewer will quit

		for (int i = 0; i < timeJ.length; ++i)
			if (((1 << i) & order) == 0) {
				jtq += timeJ[i];
			} else {
				btq += timeB[i];
			}

		int jta = 0, bta = 0; // Times where new movie will be added to reviewer queue

		for (int i = 0; i < timeJ.length; ++i)
			if (((1 << i) & order) == 0) {
				bta += timeJ[i];

				if (bta > btq)
					return false;

				btq += timeB[i];
			} else {
				jta += timeB[i];

				if (jta > jtq)
					return false;

				jtq += timeJ[i];
			}

		return true;
	}

}
