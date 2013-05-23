import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberNeighboursTest {

	protected NumberNeighbours solution;

	@Before
	public void setUp() {
		solution = new NumberNeighbours();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] numbers = new int[] { 10, 1, 100, 20, 2, 3 };

		int expected = 4;
		int actual = solution.numPairs(numbers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] numbers = new int[] { 204, 42, 40020, 200 };

		int expected = 3;
		int actual = solution.numPairs(numbers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] numbers = new int[] { 1, 10, 100, 1000, 10000, 100000, 1000000 };

		int expected = 21;
		int actual = solution.numPairs(numbers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] numbers = new int[] { 3, 33, 333, 3333 };

		int expected = 0;
		int actual = solution.numPairs(numbers);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] numbers = new int[] { 1024, 4021, 204, 303, 33, 603, 36, 55, 505 };

		int expected = 4;
		int actual = solution.numPairs(numbers);

		Assert.assertEquals(expected, actual);
	}

}
