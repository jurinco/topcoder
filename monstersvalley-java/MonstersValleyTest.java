import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonstersValleyTest {

	protected MonstersValley solution;

	@Before
	public void setUp() {
		solution = new MonstersValley();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		long[] dread = new long[] { 8, 5, 10 };
		int[] price = new int[] { 1, 1, 2 };

		int expected = 2;
		int actual = solution.minimumPrice(dread, price);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		long[] dread = new long[] { 1, 2, 4, 1000000000 };
		int[] price = new int[] { 1, 1, 1, 2 };

		int expected = 5;
		int actual = solution.minimumPrice(dread, price);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		long[] dread = new long[] { 200, 107, 105, 206, 307, 400 };
		int[] price = new int[] { 1, 2, 1, 1, 1, 2 };

		int expected = 2;
		int actual = solution.minimumPrice(dread, price);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		long[] dread = new long[] { 1, 2, 4, 8 };
		int[] price = new int[] { 2, 2, 2, 2 };

		int expected = 8;
		int actual = solution.minimumPrice(dread, price);

		Assert.assertEquals(expected, actual);
	}

}
