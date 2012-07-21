import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripleStringsTest {

	protected TripleStrings solution;

	@Before
	public void setUp() {
		solution = new TripleStrings();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String init = "ooxxox";
		String goal = "xoxoxo";

		int expected = 6;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String init = "oooxxoo";
		String goal = "oooxxoo";

		int expected = 0;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String init = "ox";
		String goal = "xo";

		int expected = 2;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String init = "ooxxooxx";
		String goal = "xxoxoxoo";

		int expected = 12;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String init = "oxxoxxoooxooooxxxoo";
		String goal = "oxooooxxxooooxoxxxo";

		int expected = 16;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String init = "xxxoxoxxooxooxoxooo";
		String goal = "oxxooxxooxxoxoxooxo";

		int expected = 36;
		int actual = solution.getMinimumOperations(init, goal);

		Assert.assertEquals(expected, actual);
	}

}
