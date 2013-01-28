import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnluckyNumbersTest {

	protected UnluckyNumbers solution;

	@Before
	public void setUp() {
		solution = new UnluckyNumbers();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] luckySet = new int[] { 1, 7, 14, 10 };
		int n = 2;

		int expected = 4;
		int actual = solution.getCount(luckySet, n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] luckySet = new int[] { 4, 8, 13, 24, 30 };
		int n = 10;

		int expected = 5;
		int actual = solution.getCount(luckySet, n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] luckySet = new int[] { 10, 20, 30, 40, 50 };
		int n = 30;

		int expected = 0;
		int actual = solution.getCount(luckySet, n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] luckySet = new int[] { 3, 7, 12, 18, 25, 100, 33, 1000 };
		int n = 59;

		int expected = 1065;
		int actual = solution.getCount(luckySet, n);

		Assert.assertEquals(expected, actual);
	}

}
