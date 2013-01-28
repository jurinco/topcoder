import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheTriangleBothDivsTest {

	protected TheTriangleBothDivs solution;

	@Before
	public void setUp() {
		solution = new TheTriangleBothDivs();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String time = "17:45 GMT-4";

		String expected = "21:45";
		String actual = solution.fix(time);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String time = "16:?? GMT??";

		String expected = "00:00";
		String actual = solution.fix(time);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String time = "?1:34 GMT-9";

		String expected = "06:34";
		String actual = solution.fix(time);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String time = "??:?? GMT??";

		String expected = "00:00";
		String actual = solution.fix(time);

		Assert.assertEquals(expected, actual);
	}

}
