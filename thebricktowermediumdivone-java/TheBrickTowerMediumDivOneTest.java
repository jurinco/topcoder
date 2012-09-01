import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheBrickTowerMediumDivOneTest {

	protected TheBrickTowerMediumDivOne solution;

	@Before
	public void setUp() {
		solution = new TheBrickTowerMediumDivOne();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] heights = new int[] { 4, 7, 5 };

		int[] expected = new int[] { 0, 2, 1 };
		int[] actual = solution.find(heights);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] heights = new int[] { 4, 4, 4, 4, 4, 4, 4 };

		int[] expected = new int[] { 0, 1, 2, 3, 4, 5, 6 };
		int[] actual = solution.find(heights);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] heights = new int[] { 2, 3, 3, 2 };

		int[] expected = new int[] { 0, 3, 1, 2 };
		int[] actual = solution.find(heights);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] heights = new int[] { 13, 32, 38, 25, 43, 47, 6 };

		int[] expected = new int[] { 0, 6, 3, 1, 2, 4, 5 };
		int[] actual = solution.find(heights);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase5() {
		Random rand = new Random();

		int[] heights = new int[20];

		for (int c = 0; c < 100; ++c) {
			for (int i = 0; i < heights.length; ++i)
				heights[i] = rand.nextInt(100);

			int[] actual = solution.find(heights);

			Assert.assertEquals(0, actual[0]);
		}
	}

}
