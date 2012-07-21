import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheCardShufflingDivTwoTest {

	protected TheCardShufflingDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheCardShufflingDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 5;
		int m = 1;

		int expected = 2;
		int actual = solution.shuffle(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 5;
		int m = 2;

		int expected = 4;
		int actual = solution.shuffle(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 2;
		int m = 10;

		int expected = 1;
		int actual = solution.shuffle(n, m);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 17;
		int m = 9;

		int expected = 2;
		int actual = solution.shuffle(n, m);

		Assert.assertEquals(expected, actual);
	}

}
