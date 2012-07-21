import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeaguePicksTest {

	protected LeaguePicks solution;

	@Before
	public void setUp() {
		solution = new LeaguePicks();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int position = 3;
		int friends = 6;
		int picks = 15;

		int[] expected = new int[] { 3, 10, 15 };
		int[] actual = solution.returnPicks(position, friends, picks);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int position = 1;
		int friends = 1;
		int picks = 10;

		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] actual = solution.returnPicks(position, friends, picks);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int position = 1;
		int friends = 2;
		int picks = 39;

		int[] expected = new int[] { 1, 4, 5, 8, 9, 12, 13, 16, 17, 20, 21, 24, 25, 28, 29, 32, 33, 36, 37 };
		int[] actual = solution.returnPicks(position, friends, picks);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int position = 5;
		int friends = 11;
		int picks = 100;

		int[] expected = new int[] { 5, 18, 27, 40, 49, 62, 71, 84, 93 };
		int[] actual = solution.returnPicks(position, friends, picks);

		Assert.assertArrayEquals(expected, actual);
	}

}
