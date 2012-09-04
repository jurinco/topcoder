import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheCardShufflingDivOneTest {

	protected TheCardShufflingDivOne solution;

	@Before
	public void setUp() {
		solution = new TheCardShufflingDivOne();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 3;
		int left = 0;
		int right = 0;

		int expected = 1;
		int actual = solution.shuffle(n, left, right);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 3;
		int left = 1;
		int right = 1;

		int expected = 3;
		int actual = solution.shuffle(n, left, right);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 5;
		int left = 0;
		int right = 0;

		int expected = 2;
		int actual = solution.shuffle(n, left, right);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 17;
		int left = 12;
		int right = 21;

		int expected = 17;
		int actual = solution.shuffle(n, left, right);

		Assert.assertEquals(expected, actual);
	}

}
