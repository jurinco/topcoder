import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HexagonalBattlefieldEasyTest {

	protected HexagonalBattlefieldEasy solution;

	@Before
	public void setUp() {
		solution = new HexagonalBattlefieldEasy();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] X = new int[] { -2, 0, 1, 1, 0 };
		int[] Y = new int[] { -2, 0, 1, 0, 2 };
		int N = 3;

		int expected = 10;
		int actual = solution.countArrangements(X, Y, N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] X = new int[] { 0 };
		int[] Y = new int[] { 0 };
		int N = 2;

		int expected = 2;
		int actual = solution.countArrangements(X, Y, N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] X = new int[] { 0 };
		int[] Y = new int[] { 0 };
		int N = 3;

		int expected = 104;
		int actual = solution.countArrangements(X, Y, N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] X = new int[] { -1, 0, 0, 1, 2 };
		int[] Y = new int[] { 0, 0, 1, 0, 0 };
		int N = 3;

		int expected = 6;
		int actual = solution.countArrangements(X, Y, N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] X = new int[] { 0, 1, 0, 0, 1, -1, -1 };
		int[] Y = new int[] { 0, 0, -1, 1, 1, 0, -1 };
		int N = 2;

		int expected = 1;
		int actual = solution.countArrangements(X, Y, N);

		Assert.assertEquals(expected, actual);
	}

}
