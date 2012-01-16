import static java.lang.Math.*;

public class PowerOutage {

	public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength) {
		return sum(ductLength) * 2 - longest(0, fromJunction, toJunction, ductLength);
	}

	private int longest(int cur, int[] fromJunction, int[] toJunction, int[] ductLength) {
		int max = 0;

		for (int i = 0; i < fromJunction.length; ++i)
			if (fromJunction[i] == cur)
				max = max(max, ductLength[i] + longest(toJunction[i], fromJunction, toJunction, ductLength));

		return max;
	}

	private int sum(int[] ductLength) {
		int s = 0;
		for (int l : ductLength)
			s += l;
		return s;
	}

}
