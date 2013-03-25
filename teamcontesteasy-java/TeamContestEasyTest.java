import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamContestEasyTest {

	protected TeamContestEasy solution;

	@Before
	public void setUp() {
		solution = new TeamContestEasy();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] strength = new int[] { 5, 7, 3, 5, 7, 3, 5, 7, 3 };

		int expected = 2;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] strength = new int[] { 5, 7, 3 };

		int expected = 1;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] strength = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int expected = 1;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] strength = new int[] { 2, 2, 1, 1, 3, 1, 3, 2, 1, 3, 1, 2, 1, 2, 1 };

		int expected = 4;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] strength = new int[] { 45, 72, 10, 42, 67, 51, 33, 21, 8, 51, 17, 72 };

		int expected = 3;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] strength = new int[] { 570466, 958327, 816467, 17, 403, 953808, 734850, 5824, 917784, 921731, 161921, 1734, 823437, 3218, 81, 932681, 2704, 981643, 1232, 475,
				873323, 6558, 45660, 1813, 4714, 224, 32301, 28081, 6728, 17055, 561, 15146, 842613, 5559, 1860, 783, 989, 2811, 20664, 112531, 1933, 866794, 805528, 53821, 2465,
				137385, 39, 2007 };

		int expected = 6;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		int[] strength = new int[] { 610297, 849870, 523999, 6557, 976530, 731458, 7404, 795100, 147040, 110947, 159692, 40785, 4949, 2903, 1688, 37278, 620703, 28156, 16823,
				1159, 12132, 971379, 5916, 1159, 988589, 12215, 133, 1490, 911360, 920059, 544070, 40249, 514852, 852, 745070, 1105, 715897, 714696, 589133, 698317, 5683, 631612,
				16453, 101000, 764881, 101, 2053, 754661 };

		int expected = 10;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		int[] strength = new int[] { 28481, 557292, 14188, 61649, 510253, 509530, 749211, 171570, 441589 };

		int expected = 3;
		int actual = solution.worstRank(strength);

		Assert.assertEquals(expected, actual);
	}

}
