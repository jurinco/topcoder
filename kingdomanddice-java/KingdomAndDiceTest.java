import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KingdomAndDiceTest {

	protected KingdomAndDice solution;

	@Before
	public void setUp() {
		solution = new KingdomAndDice();
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
		int[] firstDie = new int[] { 0, 2, 7, 0 };
		int[] secondDie = new int[] { 6, 3, 8, 10 };
		int X = 12;

		double expected = 0.4375;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] firstDie = new int[] { 0, 2, 7, 0 };
		int[] secondDie = new int[] { 6, 3, 8, 10 };
		int X = 10;

		double expected = 0.375;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] firstDie = new int[] { 0, 0 };
		int[] secondDie = new int[] { 5, 8 };
		int X = 47;

		double expected = 0.5;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] firstDie = new int[] { 19, 50, 4 };
		int[] secondDie = new int[] { 26, 100, 37 };
		int X = 1000;

		double expected = 0.2222222222222222;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] firstDie = new int[] { 6371, 0, 6256, 1852, 0, 0, 6317, 3004, 5218, 9012 };
		int[] secondDie = new int[] { 1557, 6318, 1560, 4519, 2012, 6316, 6315, 1559, 8215, 1561 };
		int X = 10000;

		double expected = 0.49;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] firstDie = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50 };
		int[] secondDie = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51 };
		int X = 10000;

		double expected = 0.49;
		double actual = solution.newFairness(firstDie, secondDie, X);

		assertEquals(expected, actual);
	}

}
