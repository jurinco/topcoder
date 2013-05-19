import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheMoviesLevelThreeDivTwoTest {

	protected TheMoviesLevelThreeDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheMoviesLevelThreeDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] timeJ = new int[] { 4, 4 };
		int[] timeB = new int[] { 4, 4 };

		int expected = 2;
		int actual = solution.find(timeJ, timeB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] timeJ = new int[] { 1, 4 };
		int[] timeB = new int[] { 4, 2 };

		int expected = 1;
		int actual = solution.find(timeJ, timeB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] timeJ = new int[] { 10, 10, 10, 10 };
		int[] timeB = new int[] { 1, 1, 1, 10 };

		int expected = 3;
		int actual = solution.find(timeJ, timeB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] timeJ = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] timeB = new int[] { 7, 6, 5, 4, 3, 2, 1 };

		int expected = 98;
		int actual = solution.find(timeJ, timeB);

		Assert.assertEquals(expected, actual);
	}

}
