import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HourGlassTest {

	protected HourGlass solution;

	@Before
	public void setUp() {
		solution = new HourGlass();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int glass1 = 5;
		int glass2 = 7;

		int[] expected = new int[] { 5, 7, 9, 10, 11, 12, 13, 14, 15, 16 };
		int[] actual = solution.measurable(glass1, glass2);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int glass1 = 13;
		int glass2 = 5;

		int[] expected = new int[] { 5, 10, 13, 15, 16, 17, 18, 19, 20, 21 };
		int[] actual = solution.measurable(glass1, glass2);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int glass1 = 23;
		int glass2 = 23;

		int[] expected = new int[] { 23, 46, 69, 92, 115, 138, 161, 184, 207, 230 };
		int[] actual = solution.measurable(glass1, glass2);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int glass1 = 24;
		int glass2 = 30;

		int[] expected = new int[] { 24, 30, 36, 42, 48, 54, 60, 66, 72, 78 };
		int[] actual = solution.measurable(glass1, glass2);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int glass1 = 1;
		int glass2 = 50;

		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] actual = solution.measurable(glass1, glass2);

		Assert.assertArrayEquals(expected, actual);
	}

}
