import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrickByBrickTest {

	protected BrickByBrick solution;

	@Before
	public void setUp() {
		solution = new BrickByBrick();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] map = new String[] { ".B", "BB" };

		int expected = 6;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] map = new String[] { ".BB", "BBB", "BBB" };

		int expected = -1;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] map = new String[] { "......B", "###.###", "B.....B" };

		int expected = 35;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] map = new String[] { "..BBB...", ".#BB..#.", "B.#B.B..", "B.B.....", "##.B.B#.", "#BB.#.B.", "B..B.BB.", "#..BB..B", ".B....#." };

		int expected = -1;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] map = new String[] { ".BB..BBB.B...", "B.B...B..BB..", "#B...B#B.....", "B#B.B##...##B", "BB.B#.B##B.B#", "B.B#.BBB.BB#B", "B#BBB##.#B#B.", "B#BB.BBB#BB.#" };

		int expected = 3912;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String[] map = new String[] { ".BBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB",
				"B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB" };

		int expected = 31753;
		int actual = solution.timeToClear(map);

		Assert.assertEquals(expected, actual);
	}

}
