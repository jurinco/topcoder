import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KingXMagicSpellsTest {

	protected KingXMagicSpells solution;

	@Before
	public void setUp() {
		solution = new KingXMagicSpells();
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
		int[] ducks = new int[] { 5, 3, 7 };
		int[] spellOne = new int[] { 1, 7, 4 };
		int[] spellTwo = new int[] { 1, 0, 2 };
		int K = 1;

		double expected = 3.5;
		double actual = solution.expectedNumber(ducks, spellOne, spellTwo, K);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] ducks = new int[] { 5, 8 };
		int[] spellOne = new int[] { 53, 7 };
		int[] spellTwo = new int[] { 1, 0 };
		int K = 2;

		double expected = 21.5;
		double actual = solution.expectedNumber(ducks, spellOne, spellTwo, K);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] ducks = new int[] { 123, 456, 789, 1234, 56789 };
		int[] spellOne = new int[] { 0, 0, 0, 0, 0 };
		int[] spellTwo = new int[] { 0, 1, 2, 3, 4 };
		int K = 50;

		double expected = 123.0;
		double actual = solution.expectedNumber(ducks, spellOne, spellTwo, K);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] ducks = new int[] { 83291232, 3124231, 192412, 3813249, 629231, 9998989 };
		int[] spellOne = new int[] { 58, 37, 44, 66, 72, 19 };
		int[] spellTwo = new int[] { 2, 0, 1, 5, 4, 3 };
		int K = 11;

		double expected = 2.888186784716797E7;
		double actual = solution.expectedNumber(ducks, spellOne, spellTwo, K);

		assertEquals(expected, actual);
	}

}
