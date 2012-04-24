import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IncredibleMachineTest {

	protected IncredibleMachine solution;

	@Before
	public void setUp() {
		solution = new IncredibleMachine();
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
		int[] x = new int[] { 0, 6 };
		int[] y = new int[] { 100, 22 };
		int T = 4;

		double expected = 9.807692307692307;
		double actual = solution.gravitationalAcceleration(x, y, T);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] x = new int[] { 0, 26, 100 };
		int[] y = new int[] { 50, 26, 24 };
		int T = 4;

		double expected = 26.743031720603582;
		double actual = solution.gravitationalAcceleration(x, y, T);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] x = new int[] { 0, 7, 8 };
		int[] y = new int[] { 10, 6, 0 };
		int T = 7;

		double expected = 1.1076837407708007;
		double actual = solution.gravitationalAcceleration(x, y, T);

		assertEquals(expected, actual);
	}

}
