import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheMoviesLevelTwoDivTwoTest {

	protected TheMoviesLevelTwoDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheMoviesLevelTwoDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] length = new int[] { 100, 50 };
		int[] scary = new int[] { 1, 1 };

		int[] expected = new int[] { 0, 1 };
		int[] actual = solution.find(length, scary);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] length = new int[] { 100, 50 };
		int[] scary = new int[] { 1, 49 };

		int[] expected = new int[] { 1, 0 };
		int[] actual = solution.find(length, scary);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] length = new int[] { 100, 100, 100, 100 };
		int[] scary = new int[] { 77, 76, 75, 74 };

		int[] expected = new int[] { 3, 0, 1, 2 };
		int[] actual = solution.find(length, scary);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] length = new int[] { 100 };
		int[] scary = new int[] { 99 };

		int[] expected = new int[] { 0 };
		int[] actual = solution.find(length, scary);

		Assert.assertArrayEquals(expected, actual);
	}

}
