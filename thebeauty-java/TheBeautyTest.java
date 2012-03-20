import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheBeautyTest {

	protected TheBeauty solution;

	@Before
	public void setUp() {
		solution = new TheBeauty();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 7;

		int expected = 1;
		int actual = solution.find(n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 100;

		int expected = 2;
		int actual = solution.find(n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 123456789;

		int expected = 9;
		int actual = solution.find(n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 1000000000;

		int expected = 2;
		int actual = solution.find(n);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int n = 932400154;

		int expected = 7;
		int actual = solution.find(n);

		Assert.assertEquals(expected, actual);
	}

}
