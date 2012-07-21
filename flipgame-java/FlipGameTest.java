import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlipGameTest {

	protected FlipGame solution;

	@Before
	public void setUp() {
		solution = new FlipGame();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] board = new String[] { "1000", "1110", "1111" };

		int expected = 1;
		int actual = solution.minOperations(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] board = new String[] { "1111", "1111", "1111" };

		int expected = 1;
		int actual = solution.minOperations(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] board = new String[] { "00", "00", "00" };

		int expected = 0;
		int actual = solution.minOperations(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] board = new String[] { "00000000", "00100000", "01000000", "00001000", "00000000" };

		int expected = 4;
		int actual = solution.minOperations(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] board = new String[] { "000000000000001100000000000000", "000000000000011110000000000000", "000000000000111111000000000000", "000000000001111111100000000000",
				"000000000011111111110000000000", "000000000111111111111000000000", "000000001100111111001100000000", "000000011000011110000110000000",
				"000000111100111111001111000000", "000001111111111111111111100000", "000011111111111111111111110000", "000111111111000000111111111000",
				"001111111111100001111111111100", "011111111111110011111111111110", "111111111111111111111111111111" };

		int expected = 29;
		int actual = solution.minOperations(board);

		Assert.assertEquals(expected, actual);
	}

}
