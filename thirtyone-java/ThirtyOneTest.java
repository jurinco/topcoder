import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThirtyOneTest {

	protected ThirtyOne solution;

	@Before
	public void setUp() {
		solution = new ThirtyOne();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] hands = new String[] { "10 A A", "K 2 3" };

		int expected = 0;
		int actual = solution.findWinner(hands);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] hands = new String[] { "2 3 4", "10 6 8", "A K 3" };

		int expected = 1;
		int actual = solution.findWinner(hands);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] hands = new String[] { "J 5 2", "2 7 5", "10 J 2", "J 6 2", "J Q K" };

		int expected = 4;
		int actual = solution.findWinner(hands);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] hands = new String[] { "Q K K", "10 J Q", "A 8 A", "2 2 2" };

		int expected = 3;
		int actual = solution.findWinner(hands);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] hands = new String[] { "Q 6 6", "7 8 3", "3 7 2", "K Q 6", "Q 6 3", "5 3 8", "10 J Q", "4 8 4", "Q 2 5", "8 A 8", "9 10 10", "2 K 5", "10 4 5", "Q 4 Q", "3 J 2",
				"7 4 4", "3 9 7", "A 4 4", "Q 7 7", "10 9 A", "J 3 5", "5 8 9", "Q Q 7" };

		int expected = 6;
		int actual = solution.findWinner(hands);

		Assert.assertEquals(expected, actual);
	}

}
