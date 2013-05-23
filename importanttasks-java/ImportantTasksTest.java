import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImportantTasksTest {

	protected ImportantTasks solution;

	@Before
	public void setUp() {
		solution = new ImportantTasks();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] complexity = new int[] { 1, 2, 3 };
		int[] computers = new int[] { 2, 2, 2 };

		int expected = 2;
		int actual = solution.maximalCost(complexity, computers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] complexity = new int[] { 1, 2, 3 };
		int[] computers = new int[] { 3 };

		int expected = 1;
		int actual = solution.maximalCost(complexity, computers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] complexity = new int[] { 3, 5, 1, 7 };
		int[] computers = new int[] { 9, 4, 1, 1, 1 };

		int expected = 3;
		int actual = solution.maximalCost(complexity, computers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] complexity = new int[] { 5, 2, 7, 8, 6, 4, 2, 10, 2, 3 };
		int[] computers = new int[] { 4, 1, 3, 6, 2, 10, 11, 1, 1, 3, 4, 2 };

		int expected = 8;
		int actual = solution.maximalCost(complexity, computers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] complexity = new int[] { 100 };
		int[] computers = new int[] { 100, 100 };

		int expected = 1;
		int actual = solution.maximalCost(complexity, computers);

		Assert.assertEquals(expected, actual);
	}

}
