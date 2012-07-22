import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckerExpansionTest {

	protected CheckerExpansion solution;

	@Before
	public void setUp() {
		solution = new CheckerExpansion();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		long t = 1L;
		long x0 = 0L;
		long y0 = 0L;
		int w = 4;
		int h = 4;

		String[] expected = new String[] { "....", "....", "....", "A..." };
		String[] actual = solution.resultAfter(t, x0, y0, w, h);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		long t = 5L;
		long x0 = 4L;
		long y0 = 1L;
		int w = 3;
		int h = 4;

		String[] expected = new String[] { "A..", "...", "B..", ".B." };
		String[] actual = solution.resultAfter(t, x0, y0, w, h);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		long t = 1024L;
		long x0 = 1525L;
		long y0 = 512L;
		int w = 20;
		int h = 2;

		String[] expected = new String[] { "B...B...B...........", ".B.A.B.A.B.........." };
		String[] actual = solution.resultAfter(t, x0, y0, w, h);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		long t = 53L;
		long x0 = 85L;
		long y0 = 6L;
		int w = 5;
		int h = 14;

		String[] expected = new String[] { ".....", ".....", "B....", ".B.A.", ".....", ".....", ".....", ".....", ".....", ".....", "B....", ".B...", "..B..", ".A.B." };
		String[] actual = solution.resultAfter(t, x0, y0, w, h);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCaseVeryBig() {
		long t = 1000000000000L;
		long x0 = 1000000000000L;
		long y0 = 1000000000000L;
		int w = 5;
		int h = 14;

		String[] expected = new String[] { ".....", ".....", "B....", ".B.A.", ".....", ".....", ".....", ".....", ".....", ".....", "B....", ".B...", "..B..", ".A.B." };
		String[] actual = solution.resultAfter(t, x0, y0, w, h);

		Assert.assertArrayEquals(expected, actual);
	}

}
