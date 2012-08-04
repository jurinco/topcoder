import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrangeComputerTest {

	protected StrangeComputer solution;

	@Before
	public void setUp() {
		solution = new StrangeComputer();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String mem = "0011";

		int expected = 1;
		int actual = solution.setMemory(mem);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String mem = "000";

		int expected = 0;
		int actual = solution.setMemory(mem);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String mem = "0100";

		int expected = 2;
		int actual = solution.setMemory(mem);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String mem = "111000111";

		int expected = 3;
		int actual = solution.setMemory(mem);

		Assert.assertEquals(expected, actual);
	}

}
