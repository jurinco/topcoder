import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MazeWanderingTest {

	protected MazeWandering solution;

	@Before
	public void setUp() {
		solution = new MazeWandering();
	}

	public static void assertEquals(double expected, double actual) {
		if (Double.isNaN(expected)) {
			Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
			return;
		}
		double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
		Assert.assertEquals(expected, actual, delta);
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] maze = new String[] { "*", "." };

		double expected = 0.5;
		double actual = solution.expectedTime(maze);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] maze = new String[] { "*.." };

		double expected = 2.3333333333333335;
		double actual = solution.expectedTime(maze);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] maze = new String[] { "...", "X*X", "..." };

		double expected = 4.857142857142857;
		double actual = solution.expectedTime(maze);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] maze = new String[] { ".*.", ".XX", "..." };

		double expected = 13.714285714285714;
		double actual = solution.expectedTime(maze);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] maze = new String[] { "*........", "XXX.XXXX.", ".XX.X....", ".....XX.X" };

		double expected = 167.2608695652174;
		double actual = solution.expectedTime(maze);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCaseBig() {
		String s = "..................................................";
		String[] maze = new String[50];

		Arrays.fill(maze, s);

		solution.expectedTime(maze);

	}
}
