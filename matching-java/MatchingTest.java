import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatchingTest {

	protected Matching solution;

	@Before
	public void setUp() {
		solution = new Matching();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] first = new String[] { "DIAMOND", "BLUE", "SOLID", "ONE" };
		String[] second = new String[] { "DIAMOND", "GREEN", "SOLID", "TWO" };

		String[] expected = new String[] { "DIAMOND", "RED", "SOLID", "THREE" };
		String[] actual = solution.findMatch(first, second);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] first = new String[] { "CIRCLE", "GREEN", "EMPTY", "TWO" };
		String[] second = new String[] { "DIAMOND", "BLUE", "STRIPED", "ONE" };

		String[] expected = new String[] { "SQUIGGLE", "RED", "SOLID", "THREE" };
		String[] actual = solution.findMatch(first, second);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] first = new String[] { "DIAMOND", "RED", "SOLID", "ONE" };
		String[] second = new String[] { "SQUIGGLE", "BLUE", "SOLID", "TWO" };

		String[] expected = new String[] { "CIRCLE", "GREEN", "SOLID", "THREE" };
		String[] actual = solution.findMatch(first, second);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] first = new String[] { "SQUIGGLE", "RED", "STRIPED", "ONE" };
		String[] second = new String[] { "SQUIGGLE", "RED", "STRIPED", "ONE" };

		String[] expected = new String[] { "SQUIGGLE", "RED", "STRIPED", "ONE" };
		String[] actual = solution.findMatch(first, second);

		Assert.assertArrayEquals(expected, actual);
	}

}
