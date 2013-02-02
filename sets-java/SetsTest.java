import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetsTest {

	protected Sets solution;

	@Before
	public void setUp() {
		solution = new Sets();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] A = new int[] { 1, 2, 3, 4 };
		int[] B = new int[] { 3, 4, 5, 6 };
		String operation = "INTERSECTION";

		int[] expected = new int[] { 3, 4 };
		int[] actual = solution.operate(A, B, operation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] A = new int[] { 1, 2, 3, 4 };
		int[] B = new int[] { 3, 4, 5, 6 };
		String operation = "UNION";

		int[] expected = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] actual = solution.operate(A, B, operation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] A = new int[] { 432, 756, 123 };
		int[] B = new int[] { 534, 76, 1209 };
		String operation = "INTERSECTION";

		int[] expected = new int[] {};
		int[] actual = solution.operate(A, B, operation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] A = new int[] { 6, 5, 7, 4 };
		int[] B = new int[] { 7, 6, 4, 10 };
		String operation = "SYMMETRIC DIFFERENCE";

		int[] expected = new int[] { 5, 10 };
		int[] actual = solution.operate(A, B, operation);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] A = new int[] { 342, 654, 897, 312, 76, 23, 78 };
		int[] B = new int[] { 21, 43, 87, 98, 23, 756, 897, 234, 645, 876, 123 };
		String operation = "SYMMETRIC DIFFERENCE";

		int[] expected = new int[] { 21, 43, 76, 78, 87, 98, 123, 234, 312, 342, 645, 654, 756, 876 };
		int[] actual = solution.operate(A, B, operation);

		Assert.assertArrayEquals(expected, actual);
	}

}
