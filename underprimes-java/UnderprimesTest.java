import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnderprimesTest {

	protected Underprimes solution;

	@Before
	public void setUp() {
		solution = new Underprimes();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int A = 2;
		int B = 10;

		int expected = 5;
		int actual = solution.howMany(A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int A = 100;
		int B = 105;

		int expected = 2;
		int actual = solution.howMany(A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int A = 17;
		int B = 17;

		int expected = 0;
		int actual = solution.howMany(A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int A = 123;
		int B = 456;

		int expected = 217;
		int actual = solution.howMany(A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 20000)
	public void testCase4() {
		int A = 1;
		int B = 100000;

		int expected = 63255;
		int actual = solution.howMany(A, B);

		Assert.assertEquals(expected, actual);
	}
}
