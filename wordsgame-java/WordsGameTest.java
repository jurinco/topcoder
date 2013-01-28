import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordsGameTest {

	protected WordsGame solution;

	@Before
	public void setUp() {
		solution = new WordsGame();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] grid = new String[] { "Mu", "uM" };
		String word = "Mu";

		int expected = 0;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] grid = new String[] { "sdf", "bca", "hgf" };
		String word = "abc";

		int expected = 2;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] grid = new String[] { "cdf", "bca", "agf" };
		String word = "abc";

		int expected = 1;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] grid = new String[] { "xSZB", "gbHk", "kbgH", "WFSg" };
		String word = "bkHg";

		int expected = 2;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] grid = new String[] { "eKUNGHktLB", "EtBFDndTlG", "RRFHmjwrDs", "eKYsHlYhlu", "ljxyJSwTds", "dUQToyWHvl", "azDPWRwioE", "EARdktoDBh", "dmIqcGSvCE", "wXypNQEMxz" };
		String word = "oDmWcJHGNk";

		int expected = 6;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String[] grid = new String[] { "ab", "bA" };
		String word = "aB";

		int expected = -1;
		int actual = solution.minimumSwaps(grid, word);

		Assert.assertEquals(expected, actual);
	}

}
