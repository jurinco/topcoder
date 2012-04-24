import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	protected VendingMachine solution;

	@Before
	public void setUp() {
		solution = new VendingMachine();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] prices = new String[] { "100 100 100" };
		String[] purchases = new String[] { "0,0:0", "0,2:5", "0,1:10" };

		int expected = 4;
		int actual = solution.motorUse(prices, purchases);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] prices = new String[] { "100 200 300 400 500 600" };
		String[] purchases = new String[] { "0,2:0", "0,3:5", "0,1:10", "0,4:15" };

		int expected = 17;
		int actual = solution.motorUse(prices, purchases);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] prices = new String[] { "100 200 300 400 500 600" };
		String[] purchases = new String[] { "0,2:0", "0,3:4", "0,1:8", "0,4:12" };

		int expected = 11;
		int actual = solution.motorUse(prices, purchases);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] prices = new String[] { "100 100 100" };
		String[] purchases = new String[] { "0,0:10", "0,0:11" };

		int expected = -1;
		int actual = solution.motorUse(prices, purchases);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] prices = new String[] { "100 200 300", "600 500 400" };
		String[] purchases = new String[] { "0,0:0", "1,1:10", "1,2:20", "0,1:21", "1,0:22", "0,2:35" };

		int expected = 6;
		int actual = solution.motorUse(prices, purchases);

		Assert.assertEquals(expected, actual);
	}

}
