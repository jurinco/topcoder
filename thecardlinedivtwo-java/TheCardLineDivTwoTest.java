import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheCardLineDivTwoTest {

	protected TheCardLineDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheCardLineDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] cards = new String[] { "KH", "QD", "KC" };

		int expected = 2;
		int actual = solution.count(cards);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] cards = new String[] { "JS", "JC", "JD", "JH" };

		int expected = 24;
		int actual = solution.count(cards);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] cards = new String[] { "2S", "3C", "4C", "5S", "6C", "7S", "8S", "9H" };

		int expected = 0;
		int actual = solution.count(cards);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] cards = new String[] { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS" };

		int expected = 2416;
		int actual = solution.count(cards);

		Assert.assertEquals(expected, actual);
	}

}
