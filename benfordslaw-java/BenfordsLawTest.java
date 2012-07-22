import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BenfordsLawTest {

	protected BenfordsLaw solution;

	@Before
	public void setUp() {
		solution = new BenfordsLaw();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] transactions = new int[] { 5236, 7290, 200, 1907, 3336, 9182, 17, 4209, 8746, 7932, 6375, 909, 2189, 3977, 2389, 2500, 1239, 3448, 6380, 4812 };
		int threshold = 2;

		int expected = 1;
		int actual = solution.questionableDigit(transactions, threshold);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] transactions = new int[] { 1, 10, 100, 2, 20, 200, 2000, 3, 30, 300 };
		int threshold = 2;

		int expected = 2;
		int actual = solution.questionableDigit(transactions, threshold);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] transactions = new int[] { 9, 87, 765, 6543, 54321, 43219, 321987, 21987, 1987, 345, 234, 123 };
		int threshold = 2;

		int expected = -1;
		int actual = solution.questionableDigit(transactions, threshold);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] transactions = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1 };
		int threshold = 8;

		int expected = 9;
		int actual = solution.questionableDigit(transactions, threshold);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] transactions = new int[] { 987, 234, 1234, 234873487, 876, 234562, 17, 7575734, 5555, 4210, 678234, 3999, 8123 };
		int threshold = 3;

		int expected = 8;
		int actual = solution.questionableDigit(transactions, threshold);

		Assert.assertEquals(expected, actual);
	}

}
