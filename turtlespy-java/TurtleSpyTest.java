import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TurtleSpyTest {

	protected TurtleSpy solution;

	@Before
	public void setUp() {
		solution = new TurtleSpy();
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
		String[] commands = new String[] { "forward 100", "backward 100", "left 90" };

		double expected = 141.4213562373095;
		double actual = solution.maxDistance(commands);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] commands = new String[] { "left 45", "forward 100", "right 45", "forward 100" };

		double expected = 200.0;
		double actual = solution.maxDistance(commands);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] commands = new String[] { "left 10", "forward 40", "right 30", "left 10", "backward 4", "forward 4" };

		double expected = 40.58520737741619;
		double actual = solution.maxDistance(commands);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] commands = new String[] { "left 10", "forward 40", "right 30", "left 70", "left 10", "backward 4", "backward 26" };

		double expected = 50;
		double actual = solution.maxDistance(commands);

		assertEquals(expected, actual);
	}

}
