import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleXorTest {

	protected DoubleXor solution;

	@Before
	public void setUp() {
		solution = new DoubleXor();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int N = 1;

		int expected = 1;
		int actual = solution.calculate(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int N = 2;

		int expected = 3;
		int actual = solution.calculate(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int N = 7;

		int expected = 0;
		int actual = solution.calculate(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int N = 10;

		int expected = 11;
		int actual = solution.calculate(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int N = 102;

		int expected = 103;
		int actual = solution.calculate(N);

		Assert.assertEquals(expected, actual);
	}

}
