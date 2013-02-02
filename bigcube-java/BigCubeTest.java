import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigCubeTest {

	protected BigCube solution;

	@Before
	public void setUp() {
		solution = new BigCube();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] range = new String[] { "1-1000000000001" };

		String expected = "1000000000000";
		String actual = solution.largestCube(range);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] range = new String[] { "10-999999999999990", "11-999999999999991", "12-999999999999992", "13-999999999999993", "14-999999999999994", "15-999999999999995",
				"16-999999999999996", "17-999999999999993", "18-999999999999994", "19-999999999999999" };

		String expected = "999970000299999";
		String actual = solution.largestCube(range);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] range = new String[] { "0-3", "10-20", "30-60", "80-120" };

		String expected = "1";
		String actual = solution.largestCube(range);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] range = new String[] { "999700030000-999999999999", "999400119993-999700029998", "999100269974-999400119991", "998800479937-999100269972" };

		String expected = "";
		String actual = solution.largestCube(range);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] range = new String[] { "0-0", "2-2", "3-3", "4-4", "5-5", "6-6", "7-7", "9-9", "10-10", "12-12", "14-14", "16-16", "18-18", "20-20", "22-22", "24-24", "26-26",
				"28-28", "30-30", "32-32", "34-34", "36-36", "38-38", "40-40", "42-42", "44-44", "46-46", "48-48", "50-50", "52-52", "54-54", "56-56", "58-58", "60-60", "62-62",
				"65-65", "67-67", "69-69", "71-71", "73-73", "75-75", "77-77", "79-79", "81-81", "83-83", "85-85", "87-87", "89-89", "99-99", "999970000300000-999999999999999" };

		String expected = "0";
		String actual = solution.largestCube(range);

		Assert.assertEquals(expected, actual);
	}

}
