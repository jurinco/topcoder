import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FixedPointTheoremTest {

	protected FixedPointTheorem solution;

	@Before
	public void setUp() {
		solution = new FixedPointTheorem();
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
		double R = 0.1;

		double expected = 0.0;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		double R = 3.05;

		double expected = 0.14754098360655865;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		double R = 3.4499;

		double expected = 0.4175631735867292;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		double R = 3.55;

		double expected = 0.5325704489850351;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		double R = 3.565;

		double expected = 0.5454276003030636;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		double R = 3.5689;

		double expected = 0.5489996297493569;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		double R = 3.00005;

		double expected = 0.004713996108955176;
		double actual = solution.cycleRange(R);

		assertEquals(expected, actual);
	}

}
