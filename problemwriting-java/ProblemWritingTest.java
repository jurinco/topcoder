import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProblemWritingTest {

	protected ProblemWriting solution;

	@Before
	public void setUp() {
		solution = new ProblemWriting();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String dotForm = "3+5";

		String expected = "";
		String actual = solution.myCheckData(dotForm);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String dotForm = "9..+.5...*....3";

		String expected = "";
		String actual = solution.myCheckData(dotForm);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String dotForm = "5.3+4";

		String expected = "dotForm is not in dot notation, check character 2.";
		String actual = solution.myCheckData(dotForm);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String dotForm = "9*9*9*9*9*9*9*9*9*9*9*9*9*9";

		String expected = "dotForm must contain between 1 and 25 characters, inclusive.";
		String actual = solution.myCheckData(dotForm);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String dotForm = "3.........../...........4";

		String expected = "";
		String actual = solution.myCheckData(dotForm);

		Assert.assertEquals(expected, actual);
	}

}
