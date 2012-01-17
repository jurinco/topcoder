import static java.lang.Math.*;

public class YahtzeeScore {

	public int maxPoints(int[] toss) {
		int max = 0;

		for (int i = 0; i <= 6; i++) {
			int sum = 0;

			for (int v : toss)
				if (v == i)
					sum += v;

			max = max(max, sum);
		}

		return max;
	}

}
