import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToolsBoxTest {

	protected ToolsBox solution;

	@Before
	public void setUp() {
		solution = new ToolsBox();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] need = new String[] { "SAW HAMMER SCREWDRIVER", "SCREWDRIVER HAMMER KNIFE" };

		int expected = 4;
		int actual = solution.countTools(need);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] need = new String[] { "SAW" };

		int expected = 1;
		int actual = solution.countTools(need);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] need = new String[] { "SAW", "SAW" };

		int expected = 1;
		int actual = solution.countTools(need);

		Assert.assertEquals(expected, actual);
	}

}
