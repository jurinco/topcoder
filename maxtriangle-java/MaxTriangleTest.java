import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxTriangleTest {

	protected MaxTriangle solution;

	@Before
	public void setUp() {
		solution = new MaxTriangle();
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
		int A = 1;
		int B = 1;

		double expected = 0.5;
		double actual = solution.calculateArea(A, B);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int A = 3;
		int B = 7;

		double expected = -1.0;
		double actual = solution.calculateArea(A, B);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int A = 41;
		int B = 85;

		double expected = 29.5;
		double actual = solution.calculateArea(A, B);

		assertEquals(expected, actual);
	}

}
