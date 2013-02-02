import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EigenVectorTest {

	protected EigenVector solution;

	@Before
	public void setUp() {
		solution = new EigenVector();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] A = new String[] { "1 0 0 0 0", "0 1 0 0 0", "0 0 1 0 0", "0 0 0 1 0", "0 0 0 0 1" };

		int[] expected = new int[] { 0, 0, 0, 0, 1 };
		int[] actual = solution.findEigenVector(A);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] A = new String[] { "100 0 0 0", "0 200 0 0", "0 0 333 0", "0 0 0 42" };

		int[] expected = new int[] { 0, 0, 0, 1 };
		int[] actual = solution.findEigenVector(A);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] A = new String[] { "10 -10 -10 10", "20 40 -10 -10", "10 -10 10 20", "10 10 20 5" };

		int[] expected = new int[] { 1, -5, 2, 0 };
		int[] actual = solution.findEigenVector(A);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] A = new String[] { "30 20", "87 2" };

		int[] expected = new int[] { 2, 3 };
		int[] actual = solution.findEigenVector(A);

		Assert.assertArrayEquals(expected, actual);
	}

}
