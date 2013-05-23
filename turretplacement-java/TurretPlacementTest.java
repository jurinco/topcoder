import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TurretPlacementTest {

	protected TurretPlacement solution;

	@Before
	public void setUp() {
		solution = new TurretPlacement();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] x = new int[] { 0, 2 };
		int[] y = new int[] { 0, 2 };

		long expected = 10L;
		long actual = solution.count(x, y);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] x = new int[] { 0, 1, 2 };
		int[] y = new int[] { 0, 1, 0 };

		long expected = 8L;
		long actual = solution.count(x, y);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] x = new int[] { 1, 2, 3, 0 };
		int[] y = new int[] { -1, -5, -7, 100 };

		long expected = 65137L;
		long actual = solution.count(x, y);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] x = new int[] { 9998, -10000, 10000, 0 };
		int[] y = new int[] { 9998, 10000, 10000, 0 };

		long expected = 2799564895L;
		long actual = solution.count(x, y);

		Assert.assertEquals(expected, actual);
	}

}
