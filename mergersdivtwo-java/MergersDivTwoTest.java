import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergersDivTwoTest {

	protected MergersDivTwo solution;

	@Before
	public void setUp() {
		solution = new MergersDivTwo();
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
		int k = 2;

		double expected = 1.5;
		double actual = solution.findMaximum(revenues, k);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] revenues = new int[] { 5, -7, 3 };
		int k = 3;

		double expected = 0.3333333333333333;
		double actual = solution.findMaximum(revenues, k);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] revenues = new int[] { 1, 2, 2, 3, -10, 7 };
		int k = 3;

		double expected = 2.9166666666666665;
		double actual = solution.findMaximum(revenues, k);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] revenues = new int[] { -100, -100, -100, -100, -100, 100 };
		int k = 4;

		double expected = -66.66666666666667;
		double actual = solution.findMaximum(revenues, k);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] revenues = new int[] { 869, 857, -938, -290, 79, -901, 32, -907, 256, -167, 510, -965, -826, 808, 890, -233, -881, 255, -709, 506, 334, -184, 726, -406, 204, -912,
				325, -445, 440, -368 };
		int k = 7;

		double expected = 706.0369290573373;
		double actual = solution.findMaximum(revenues, k);

		assertEquals(expected, actual);
	}

}
