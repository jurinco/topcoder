import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergersDivOneTest {

	protected MergersDivOne solution;

	@Before
	public void setUp() {
		solution = new MergersDivOne();
	}

	public static void assertEquals(double expected, double actual) {
		if (Double.isNaN(expected)) {
			Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
			return;
		}
		double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
		Assert.assertEquals(expected, actual, delta);
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] revenues = new int[] { 5, -7, 3 };

		double expected = 1.5;
		double actual = solution.findMaximum(revenues);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] revenues = new int[] { 10, -17 };

		double expected = -3.5;
		double actual = solution.findMaximum(revenues);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] revenues = new int[] { 12, 12, 12, 12, 12 };

		double expected = 12.0;
		double actual = solution.findMaximum(revenues);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] revenues = new int[] { 0, 0, 0, 0, 0, 100 };

		double expected = 50.0;
		double actual = solution.findMaximum(revenues);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] revenues = new int[] { 10, -10, 100, -100, 1000, -1000 };

		double expected = 491.25;
		double actual = solution.findMaximum(revenues);

		assertEquals(expected, actual);
	}

}
