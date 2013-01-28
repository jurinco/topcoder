import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KnightCircuit2Test {

	protected KnightCircuit2 solution;

	@Before
	public void setUp() {
		solution = new KnightCircuit2();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int w = 1;
		int h = 1;

		int expected = 1;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int w = 15;
		int h = 2;

		int expected = 8;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase11() {
		int w = 2;
		int h = 15;

		int expected = 8;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase8() {
		int w = 3;
		int h = 3;

		int expected = 8;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase12() {
		int w = 3;
		int h = 4;

		int expected = 12;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int w = 100;
		int h = 100;

		int expected = 10000;
		int actual = solution.maxSize(w, h);

		Assert.assertEquals(expected, actual);
	}

}
