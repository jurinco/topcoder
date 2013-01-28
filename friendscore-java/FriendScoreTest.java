import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FriendScoreTest {

	protected FriendScore solution;

	@Before
	public void setUp() {
		solution = new FriendScore();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] friends = new String[] { "NNN", "NNN", "NNN" };

		int expected = 0;
		int actual = solution.highestScore(friends);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] friends = new String[] { "NYY", "YNY", "YYN" };

		int expected = 2;
		int actual = solution.highestScore(friends);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] friends = new String[] { "NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN" };

		int expected = 4;
		int actual = solution.highestScore(friends);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] friends = new String[] { "NNNNYNNNNN", "NNNNYNYYNN", "NNNYYYNNNN", "NNYNNNNNNN", "YYYNNNNNNY", "NNYNNNNNYN", "NYNNNNNYNN", "NYNNNNYNNN", "NNNNNYNNNN",
				"NNNNYNNNNN" };

		int expected = 8;
		int actual = solution.highestScore(friends);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] friends = new String[] { "NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN", "NNNNNNNYNNNNNNN", "NNNNNNNYNNNNNNY", "NNNNNNNNNNNNNNY", "NNNNNNNNYNNNNNN", "NNNNNNNNNNNNNNN",
				"NNYYNNNNNNNNNNN", "NNNNNYNNNNNYNNN", "NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN", "NNNNNNNNYNNNNNN", "NNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNN", "YNNYYNNNNYNNNNN" };

		int expected = 6;
		int actual = solution.highestScore(friends);

		Assert.assertEquals(expected, actual);
	}

}
