import static java.lang.Math.*;

public class RectangularGrid {

	public long countRectangles(int width, int height) {
		long wr = width * (width + 1) / 2;
		long hr = height * (height + 1) / 2;
		return wr * hr - countSquares(width, height);
	}

	private long countSquares(int w, int h) {
		int m = min(w, h);
		long sum = 0;

		for (int i = 0; i < m; ++i)
			sum += (w - i) * (h - i);

		return sum;
	}

}
