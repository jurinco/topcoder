import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiskSchedulerTest {

	protected DiskScheduler solution;

	@Before
	public void setUp() {
		solution = new DiskScheduler();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int start = 5;
		int[] sectors = new int[] { 6, 8, 65, 71 };

		int expected = 46;
		int actual = solution.optimize(start, sectors);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int start = 5;
		int[] sectors = new int[] { 55, 65, 71 };

		int expected = 50;
		int actual = solution.optimize(start, sectors);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int start = 20;
		int[] sectors = new int[] { 1, 21, 99 };

		int expected = 23;
		int actual = solution.optimize(start, sectors);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int start = 99;
		int[] sectors = new int[] { 55, 56, 61, 70, 76, 78, 80, 83, 84, 90, 1, 4, 6, 26, 27, 33, 38, 46, 47, 49 };

		int expected = 87;
		int actual = solution.optimize(start, sectors);

		Assert.assertEquals(expected, actual);
	}

}
