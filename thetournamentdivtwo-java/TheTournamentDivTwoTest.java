import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheTournamentDivTwoTest {

	protected TheTournamentDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheTournamentDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] points = new int[] { 10, 1, 1 };

		int expected = 6;
		int actual = solution.find(points);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] points = new int[] { 1, 1, 1 };

		int expected = -1;
		int actual = solution.find(points);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] points = new int[] { 0, 0, 0, 0, 0, 0, 0 };

		int expected = 0;
		int actual = solution.find(points);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] points = new int[] { 13, 8, 7 };

		int expected = 14;
		int actual = solution.find(points);

		Assert.assertEquals(expected, actual);
	}

}
