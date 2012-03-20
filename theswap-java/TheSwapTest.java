import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheSwapTest {

	protected TheSwap solution;

	@Before
	public void setUp() {
		solution = new TheSwap();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 16375;
		int k = 1;

		int expected = 76315;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 432;
		int k = 1;

		int expected = 423;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 90;
		int k = 4;

		int expected = -1;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 5;
		int k = 2;

		int expected = -1;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int n = 436659;
		int k = 2;

		int expected = 966354;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int n = 35766;
		int k = 3;

		int expected = 76653;
		int actual = solution.findMax(n, k);

		Assert.assertEquals(expected, actual);
	}

}
