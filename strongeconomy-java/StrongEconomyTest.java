import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrongEconomyTest {

	protected StrongEconomy solution;

	@Before
	public void setUp() {
		solution = new StrongEconomy();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		long n = 2L;
		long k = 1L;
		long price = 2L;
		long target = 10L;

		long expected = 4L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		long n = 2L;
		long k = 1L;
		long price = 2L;
		long target = 9L;

		long expected = 3L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		long n = 1L;
		long k = 1L;
		long price = 500000L;
		long target = 1000002L;

		long expected = 1000001L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		long n = 5L;
		long k = 4L;
		long price = 15L;
		long target = 100L;

		long expected = 5L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		long n = 999999999999L;
		long k = 1844674408L;
		long price = 1000000000000L;
		long target = 1000000000000L;

		long expected = 1L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		long n = 1000L;
		long k = 1L;
		long price = 383L;
		long target = 943416963123L;

		long expected = 11L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		long n = 4294967295L;
		long k = 1L;
		long price = 1L;
		long target = 10000000000L;

		long expected = 2L;
		long actual = solution.earn(n, k, price, target);

		Assert.assertEquals(expected, actual);
	}
}
