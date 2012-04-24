import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnluckyIntervalsTest {

	protected UnluckyIntervals solution;

	@Before
	public void setUp() {
		solution = new UnluckyIntervals();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] luckySet = new int[] { 3 };
		int n = 6;

		int[] expected = new int[] { 3, 1, 2, 4, 5, 6 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] luckySet = new int[] { 5, 11, 18 };
		int n = 9;

		int[] expected = new int[] { 5, 11, 18, 1, 4, 6, 10, 2, 3 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] luckySet = new int[] { 7, 13, 18 };
		int n = 9;

		int[] expected = new int[] { 7, 13, 18, 14, 17, 8, 12, 1, 6 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] luckySet = new int[] { 1000, 1004, 4000, 4003, 5000 };
		int n = 19;

		int[] expected = new int[] { 1000, 1004, 4000, 4003, 5000, 4001, 4002, 1001, 1003, 1002, 4004, 4999, 1, 999, 4005, 4998, 2, 998, 4006 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] luckySet = new int[] { 1000000000 };
		int n = 8;

		int[] expected = new int[] { 1000000000, 1, 999999999, 2, 999999998, 3, 999999997, 4 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] luckySet = new int[] { 2, 5, 11, 18 };
		int n = 4;

		int[] expected = new int[] { 1, 2, 5, 11 };
		int[] actual = solution.getLuckiest(luckySet, n);

		Assert.assertArrayEquals(expected, actual);
	}

}
