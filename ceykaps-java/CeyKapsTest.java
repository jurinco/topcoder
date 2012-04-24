import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CeyKapsTest {

	protected CeyKaps solution;

	@Before
	public void setUp() {
		solution = new CeyKaps();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String typed = "AAAAA";
		String[] switches = new String[] { "A:B", "B:C", "A:D" };

		String expected = "CCCCC";
		String actual = solution.decipher(typed, switches);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String typed = "ABCDE";
		String[] switches = new String[] { "A:B", "B:C", "C:D", "D:E", "E:A" };

		String expected = "AEBCD";
		String actual = solution.decipher(typed, switches);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String typed = "IHWSIOTCHEDMYKEYCAPSARWUND";
		String[] switches = new String[] { "W:O", "W:I" };

		String expected = "WHOSWITCHEDMYKEYCAPSAROUND";
		String actual = solution.decipher(typed, switches);

		Assert.assertEquals(expected, actual);
	}

}
