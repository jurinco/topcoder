import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheBasketballDivOneTest {

	protected TheBasketballDivOne solution;

	@Before
	public void setUp() {
		solution = new TheBasketballDivOne();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 2;
		int m = 1;

		int expected = 1;
		int actual = solution.find(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 3;
		int m = 1;

		int expected = 0;
		int actual = solution.find(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 3;
		int m = 3;

		int expected = 2;
		int actual = solution.find(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 4;
		int m = 6;

		int expected = 5;
		int actual = solution.find(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCaseTime() {
		int n = 5;
		int m = 6;

		solution.find(n, m);
	}

}
