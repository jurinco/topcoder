import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CasketOfStarTest {

	protected CasketOfStar solution;

	@Before
	public void setUp() {
		solution = new CasketOfStar();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] weight = new int[] { 1, 2, 3, 4 };

		int expected = 12;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] weight = new int[] { 100, 2, 1, 3, 100 };

		int expected = 10400;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] weight = new int[] { 2, 2, 7, 6, 90, 5, 9 };

		int expected = 1818;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] weight = new int[] { 477, 744, 474, 777, 447, 747, 777, 474 };

		int expected = 2937051;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] weight = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int expected = 13;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int[] weight = new int[] { 687, 480, 542, 589, 683, 668, 630, 508, 553, 586, 462, 676, 516, 672, 500, 431, 432, 686, 551, 490, 690, 655, 677, 648, 529, 638, 632, 682, 569,
				655, 596, 511, 535, 657, 692, 697, 655, 518 };

		int expected = 15471373;
		int actual = solution.maxEnergy(weight);

		Assert.assertEquals(expected, actual);
	}

}
