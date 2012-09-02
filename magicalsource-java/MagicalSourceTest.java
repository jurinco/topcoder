import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicalSourceTest {

	protected MagicalSource solution;

	@Before
	public void setUp() {
		solution = new MagicalSource();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		long x = 1371110974L;

		long expected = 1234L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		long x = 111111L;

		long expected = 1L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		long x = 10989L;

		long expected = 99L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		long x = 120L;

		long expected = 120L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		long x = 109999999989L;

		long expected = 99L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		long x = 999999999988L;

		long expected = 90909090908L;
		long actual = solution.calculate(x);

		Assert.assertEquals(expected, actual);
	}
}
