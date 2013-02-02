import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThePriceIsRightTest {

	protected ThePriceIsRight solution;

	@Before
	public void setUp() {
		solution = new ThePriceIsRight();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] prices = new int[] { 30, 10, 20, 40, 50 };

		int[] expected = new int[] { 4, 1 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] prices = new int[] { 39, 88, 67, 5, 69, 87, 82, 64, 58, 61 };

		int[] expected = new int[] { 4, 2 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] prices = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] expected = new int[] { 10, 1 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] prices = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int[] expected = new int[] { 1, 10 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] prices = new int[] { 29, 31, 73, 70, 14, 5, 6, 34, 53, 30, 15, 86 };

		int[] expected = new int[] { 5, 2 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] prices = new int[] { 100, 99, 1, 2, 3 };

		int[] expected = new int[] { 3, 1 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		int[] prices = new int[] { 10, 20, 11, 12 };

		int[] expected = new int[] { 3, 1 };
		int[] actual = solution.howManyReveals(prices);

		Assert.assertArrayEquals(expected, actual);
	}

}
