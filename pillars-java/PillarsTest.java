import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PillarsTest {

	protected Pillars solution;

	@Before
	public void setUp() {
		solution = new Pillars();
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
		int w = 1;
		int x = 1;
		int y = 1;

		double expected = 1.0;
		double actual = solution.getExpectedLength(w, x, y);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int w = 1;
		int x = 5;
		int y = 1;

		double expected = 2.387132965131785;
		double actual = solution.getExpectedLength(w, x, y);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int w = 2;
		int x = 3;
		int y = 15;

		double expected = 6.737191281760445;
		double actual = solution.getExpectedLength(w, x, y);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int w = 10;
		int x = 15;
		int y = 23;

		double expected = 12.988608956320535;
		double actual = solution.getExpectedLength(w, x, y);

		assertEquals(expected, actual);
	}

}
