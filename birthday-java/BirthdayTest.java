import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirthdayTest {

	protected Birthday solution;

	@Before
	public void setUp() {
		solution = new Birthday();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String date = "06/17";
		String[] birthdays = new String[] { "02/17 Wernie", "10/12 Stefan" };

		String expected = "10/12";
		String actual = solution.getNext(date, birthdays);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String date = "06/17";
		String[] birthdays = new String[] { "10/12 Stefan" };

		String expected = "10/12";
		String actual = solution.getNext(date, birthdays);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String date = "02/17";
		String[] birthdays = new String[] { "02/17 Wernie", "10/12 Stefan" };

		String expected = "02/17";
		String actual = solution.getNext(date, birthdays);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String date = "12/24";
		String[] birthdays = new String[] { "10/12 Stefan" };

		String expected = "10/12";
		String actual = solution.getNext(date, birthdays);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String date = "01/02";
		String[] birthdays = new String[] { "02/17 Wernie", "10/12 Stefan", "02/17 MichaelJordan", "10/12 LucianoPavarotti", "05/18 WilhelmSteinitz" };

		String expected = "02/17";
		String actual = solution.getNext(date, birthdays);

		Assert.assertEquals(expected, actual);
	}

}
