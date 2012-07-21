import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlackWhiteMagicTest {

	protected BlackWhiteMagic solution;

	@Before
	public void setUp() {
		solution = new BlackWhiteMagic();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String creatures = "WBBW";

		int expected = 1;
		int actual = solution.count(creatures);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String creatures = "WWWWBBBB";

		int expected = 0;
		int actual = solution.count(creatures);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String creatures = "BBWW";

		int expected = 2;
		int actual = solution.count(creatures);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String creatures = "BWWWWWWWBBBBBBBW";

		int expected = 1;
		int actual = solution.count(creatures);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String creatures = "WBWBWBWBWWBWBWBWBBBWBW";

		int expected = 5;
		int actual = solution.count(creatures);

		Assert.assertEquals(expected, actual);
	}

}
