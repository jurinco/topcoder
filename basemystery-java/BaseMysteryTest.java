import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseMysteryTest {

	protected BaseMystery solution;

	@Before
	public void setUp() {
		solution = new BaseMystery();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String equation = "1+1=2";

		int[] expected = new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String equation = "1+1=10";

		int[] expected = new int[] { 2 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String equation = "1+1=3";

		int[] expected = new int[] {};
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String equation = "ABCD+211=B000";

		int[] expected = new int[] { 14 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String equation = "ABCD+322=B000";

		int[] expected = new int[] { 15 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String equation = "1+0=1";

		int[] expected = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String equation = "GHIJ+1111=HJ00";

		int[] expected = new int[] { 20 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		String equation = "1234+8765=9999";

		int[] expected = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] actual = solution.getBase(equation);

		Assert.assertArrayEquals(expected, actual);
	}

}
