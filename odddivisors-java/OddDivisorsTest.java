import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddDivisorsTest {

	protected OddDivisors solution;

	@Before
	public void setUp() {
		solution = new OddDivisors();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int N = 7;

		long expected = 21L;
		long actual = solution.findSum(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int N = 1;

		long expected = 1L;
		long actual = solution.findSum(N);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int N = 777;

		long expected = 201537L;
		long actual = solution.findSum(N);

		Assert.assertEquals(expected, actual);
	}

}
