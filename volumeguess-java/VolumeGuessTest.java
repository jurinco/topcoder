import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VolumeGuessTest {

	protected VolumeGuess solution;

	@Before
	public void setUp() {
		solution = new VolumeGuess();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] queries = new String[] { "1,2,10", "1,3,10", "2,3,20" };
		int numberOfBoxes = 3;
		int ithBox = 1;

		int expected = 10;
		int actual = solution.correctVolume(queries, numberOfBoxes, ithBox);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] queries = new String[] { "1,02,10", "2,3,010", "1,3,20" };
		int numberOfBoxes = 3;
		int ithBox = 2;

		int expected = 10;
		int actual = solution.correctVolume(queries, numberOfBoxes, ithBox);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] queries = new String[] { "1,2,31", "1,3,9", "1,4,31", "2,4,32", "3,4,9", "3,2,9" };
		int numberOfBoxes = 4;
		int ithBox = 1;

		int expected = 31;
		int actual = solution.correctVolume(queries, numberOfBoxes, ithBox);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] queries = new String[] { "1,2,31", "1,3,9", "1,4,31", "2,4,32", "3,4,9", "3,2,9" };
		int numberOfBoxes = 4;
		int ithBox = 3;

		int expected = 9;
		int actual = solution.correctVolume(queries, numberOfBoxes, ithBox);

		Assert.assertEquals(expected, actual);
	}

}
