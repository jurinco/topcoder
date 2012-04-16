import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordXPalindromeTest {

	protected PasswordXPalindrome solution;

	@Before
	public void setUp() {
		solution = new PasswordXPalindrome();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String password = "levle";

		int expected = 1;
		int actual = solution.minSwaps(password);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String password = "racecar";

		int expected = 0;
		int actual = solution.minSwaps(password);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String password = "abcdadcb";

		int expected = 3;
		int actual = solution.minSwaps(password);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String password = "msmscielciel";

		int expected = 5;
		int actual = solution.minSwaps(password);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String password = "hicanyouguesstodaywriter";

		int expected = -1;
		int actual = solution.minSwaps(password);

		Assert.assertEquals(expected, actual);
	}

}
