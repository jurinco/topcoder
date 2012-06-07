import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GogoXBallsAndBinsTest {

	protected GogoXBallsAndBins solution;

	@Before
	public void setUp() {
		solution = new GogoXBallsAndBins();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] T = new int[] { 1, 2, 3 };
		int moves = 1;

		int expected = 2;
		int actual = solution.solve(T, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] T = new int[] { 1, 2, 3 };
		int moves = 2;

		int expected = 3;
		int actual = solution.solve(T, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] T = new int[] { 1, 2, 3 };
		int moves = 3;

		int expected = 0;
		int actual = solution.solve(T, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] T = new int[] { 1, 2, 3 };
		int moves = 0;

		int expected = 1;
		int actual = solution.solve(T, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] T = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int moves = 64;

		int expected = 625702391;
		int actual = solution.solve(T, moves);

		Assert.assertEquals(expected, actual);
	}

}
