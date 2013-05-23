import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LotteryCheatingTest {

	protected LotteryCheating solution;

	@Before
	public void setUp() {
		solution = new LotteryCheating();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String ID = "1";

		int expected = 0;
		int actual = solution.minimalChange(ID);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String ID = "1234";

		int expected = 2;
		int actual = solution.minimalChange(ID);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String ID = "9000000000";

		int expected = 1;
		int actual = solution.minimalChange(ID);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String ID = "4294967296";

		int expected = 0;
		int actual = solution.minimalChange(ID);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String ID = "7654321";

		int expected = 3;
		int actual = solution.minimalChange(ID);

		Assert.assertEquals(expected, actual);
	}

}
