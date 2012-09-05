import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TireRotationTest {

	protected TireRotation solution;

	@Before
	public void setUp() {
		solution = new TireRotation();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String initial = "ABCD";
		String current = "ABCD";

		int expected = 1;
		int actual = solution.getCycle(initial, current);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String initial = "ABCD";
		String current = "DCAB";

		int expected = 2;
		int actual = solution.getCycle(initial, current);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String initial = "ABCD";
		String current = "CDBA";

		int expected = 4;
		int actual = solution.getCycle(initial, current);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String initial = "ABCD";
		String current = "ABDC";

		int expected = -1;
		int actual = solution.getCycle(initial, current);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String initial = "ZAXN";
		String current = "XNAZ";

		int expected = 4;
		int actual = solution.getCycle(initial, current);

		Assert.assertEquals(expected, actual);
	}

}
