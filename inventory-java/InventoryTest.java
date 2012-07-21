import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {

	protected Inventory solution;

	@Before
	public void setUp() {
		solution = new Inventory();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] sales = new int[] { 5 };
		int[] daysAvailable = new int[] { 15 };

		int expected = 10;
		int actual = solution.monthlyOrder(sales, daysAvailable);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] sales = new int[] { 75, 120, 0, 93 };
		int[] daysAvailable = new int[] { 24, 30, 0, 30 };

		int expected = 103;
		int actual = solution.monthlyOrder(sales, daysAvailable);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] sales = new int[] { 8773 };
		int[] daysAvailable = new int[] { 16 };

		int expected = 16450;
		int actual = solution.monthlyOrder(sales, daysAvailable);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] sales = new int[] { 1115, 7264, 3206, 6868, 7301 };
		int[] daysAvailable = new int[] { 1, 3, 9, 4, 18 };

		int expected = 36091;
		int actual = solution.monthlyOrder(sales, daysAvailable);

		Assert.assertEquals(expected, actual);
	}

}
