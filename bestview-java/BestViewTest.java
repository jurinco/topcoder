import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestViewTest {

	protected BestView solution;

	@Before
	public void setUp() {
		solution = new BestView();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] heights = new int[] { 10 };

		int expected = 0;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] heights = new int[] { 5, 5, 5, 5 };

		int expected = 2;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] heights = new int[] { 1, 2, 7, 3, 2 };

		int expected = 4;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] heights = new int[] { 1, 5, 3, 2, 6, 3, 2, 6, 4, 2, 5, 7, 3, 1, 5 };

		int expected = 7;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] heights = new int[] { 1000000000, 999999999, 999999998, 999999997, 999999996, 1, 2, 3, 4, 5 };

		int expected = 6;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] heights = new int[] { 244645169, 956664793, 752259473, 577152868, 605440232, 569378507, 111664772, 653430457, 454612157, 397154317 };

		int expected = 7;
		int actual = solution.numberOfBuildings(heights);

		Assert.assertEquals(expected, actual);
	}

}
