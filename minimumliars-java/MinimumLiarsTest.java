import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumLiarsTest {

	protected MinimumLiars solution;

	@Before
	public void setUp() {
		solution = new MinimumLiars();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] claim = new int[] { 1, 1, 1, 2 };

		int expected = 1;
		int actual = solution.getMinimum(claim);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] claim = new int[] { 7, 8, 1 };

		int expected = 2;
		int actual = solution.getMinimum(claim);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] claim = new int[] { 5, 5, 5, 5, 5 };

		int expected = -1;
		int actual = solution.getMinimum(claim);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] claim = new int[] { 0, 0, 0, 4, 3, 0 };

		int expected = 2;
		int actual = solution.getMinimum(claim);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] claim = new int[] { 4, 7, 5 };

		int expected = 3;
		int actual = solution.getMinimum(claim);

		Assert.assertEquals(expected, actual);
	}

}
