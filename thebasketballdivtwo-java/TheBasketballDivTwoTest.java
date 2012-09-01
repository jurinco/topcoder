import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheBasketballDivTwoTest {

	protected TheBasketballDivTwo solution;

	@Before
	public void setUp() {
		solution = new TheBasketballDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] table = new String[] { "X?", "?X" };

		int expected = 1;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] table = new String[] { "XW", "LX" };

		int expected = 2;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] table = new String[] { "XWL", "?XW", "WLX" };

		int expected = 2;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] table = new String[] { "XW?", "LX?", "??X" };

		int expected = 2;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] table = new String[] { "XL?LL", "WX???", "?LX?W", "LLLXL", "WWWWX" };

		int expected = 6;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCaseTime() {
		String[] table = new String[] { "X????", "?X???", "??X??", "???X?", "????X" };

		int expected = 4;
		int actual = solution.find(table);

		Assert.assertEquals(expected, actual);
	}

}
