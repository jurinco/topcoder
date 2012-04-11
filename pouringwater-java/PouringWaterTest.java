import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PouringWaterTest {

	protected PouringWater solution;

	@Before
	public void setUp() {
		solution = new PouringWater();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int N = 3;
		int K = 1;

		int expected = 1;
		int actual = solution.getMinBottles(N, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int N = 13;
		int K = 2;

		int expected = 3;
		int actual = solution.getMinBottles(N, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int N = 1000000;
		int K = 5;

		int expected = 15808;
		int actual = solution.getMinBottles(N, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int N = 1;
		int K = 2;

		int expected = 0;
		int actual = solution.getMinBottles(N, K);

		Assert.assertEquals(expected, actual);
	}
}
