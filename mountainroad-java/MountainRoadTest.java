import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MountainRoadTest {

	protected MountainRoad solution;

	@Before
	public void setUp() {
		solution = new MountainRoad();
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
		int[] start = new int[] { 1 };
		int[] finish = new int[] { 7 };

		double expected = 8.485281374238571;
		double actual = solution.findDistance(start, finish);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] start = new int[] { 0, 3, 4 };
		int[] finish = new int[] { 5, 9, 6 };

		double expected = 12.727922061357857;
		double actual = solution.findDistance(start, finish);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] start = new int[] { 1, 4, 5, 6, -10 };
		int[] finish = new int[] { 101, 102, 101, 100, 99 };

		double expected = 158.39191898578665;
		double actual = solution.findDistance(start, finish);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] start = new int[] { -5, -3 };
		int[] finish = new int[] { -2, -2 };

		double expected = 4.242640687119286;
		double actual = solution.findDistance(start, finish);

		assertEquals(expected, actual);
	}

}
