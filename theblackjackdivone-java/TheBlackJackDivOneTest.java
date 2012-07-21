import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheBlackJackDivOneTest {

	protected TheBlackJackDivOne solution;

	@Before
	public void setUp() {
		solution = new TheBlackJackDivOne();
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
		String[] cards = new String[] { "JS" };

		double expected = 2.105854341736695;
		double actual = solution.expected(cards);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] cards = new String[] { "KD", "8S" };

		double expected = 1.08;
		double actual = solution.expected(cards);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] cards = new String[] { "KD", "2S", "2C", "2D", "2H" };

		double expected = 1.0;
		double actual = solution.expected(cards);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] cards = new String[] { "AS", "KS", "9S", "JC", "2D" };

		double expected = 0.0;
		double actual = solution.expected(cards);

		assertEquals(expected, actual);
	}

}
