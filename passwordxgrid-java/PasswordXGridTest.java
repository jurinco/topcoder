import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordXGridTest {

	protected PasswordXGrid solution;

	@Before
	public void setUp() {
		solution = new PasswordXGrid();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] horizontal = new String[] { "1", "4" };
		String[] vertical = new String[] { "32" };

		int expected = 7;
		int actual = solution.minSum(horizontal, vertical);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] horizontal = new String[] { "47", "59" };
		String[] vertical = new String[] { "361" };

		int expected = 19;
		int actual = solution.minSum(horizontal, vertical);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] horizontal = new String[] { "36", "23", "49" };
		String[] vertical = new String[] { "890", "176" };

		int expected = 28;
		int actual = solution.minSum(horizontal, vertical);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] horizontal = new String[] { "8888585", "5888585" };
		String[] vertical = new String[] { "58585858" };

		int expected = 58;
		int actual = solution.minSum(horizontal, vertical);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] horizontal = new String[] { "7777777", "7777777", "7777777", "7777777" };
		String[] vertical = new String[] { "44444444", "44444444", "44444444" };

		int expected = 61;
		int actual = solution.minSum(horizontal, vertical);

		Assert.assertEquals(expected, actual);
	}

}
