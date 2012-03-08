import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysCheckersTest {

	protected EllysCheckers solution;

	@Before
	public void setUp() {
		solution = new EllysCheckers();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String board = ".o...";

		String expected = "YES";
		String actual = solution.getWinner(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String board = "..o..o";

		String expected = "YES";
		String actual = solution.getWinner(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String board = ".o...ooo..oo..";

		String expected = "NO";
		String actual = solution.getWinner(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String board = "......o.ooo.o......";

		String expected = "YES";
		String actual = solution.getWinner(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String board = ".o..o...o....o.....o";

		String expected = "NO";
		String actual = solution.getWinner(board);

		Assert.assertEquals(expected, actual);
	}

}
