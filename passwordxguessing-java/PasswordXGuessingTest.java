import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordXGuessingTest {

	protected PasswordXGuessing solution;

	@Before
	public void setUp() {
		solution = new PasswordXGuessing();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] guesses = new String[] { "58", "47" };

		long expected = 2L;
		long actual = solution.howMany(guesses);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] guesses = new String[] { "539", "540", "541" };

		long expected = 1L;
		long actual = solution.howMany(guesses);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] guesses = new String[] { "12", "34", "56", "78" };

		long expected = 0L;
		long actual = solution.howMany(guesses);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] guesses = new String[] { "2", "3", "5" };

		long expected = 7L;
		long actual = solution.howMany(guesses);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] guesses = new String[] { "4747", "4747", "4747", "4747" };

		long expected = 36L;
		long actual = solution.howMany(guesses);

		Assert.assertEquals(expected, actual);
	}

}
