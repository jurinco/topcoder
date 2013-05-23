import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RouteIntersectionTest {

	protected RouteIntersection solution;

	@Before
	public void setUp() {
		solution = new RouteIntersection();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int N = 1;
		int[] coords = new int[] { 1 };
		String moves = "+";

		String expected = "VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int N = 2;
		int[] coords = new int[] { 1, 2, 1, 2 };
		String moves = "++--";

		String expected = "NOT VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int N = 3;
		int[] coords = new int[] { 1, 2, 3, 1, 2 };
		String moves = "+++--";

		String expected = "VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int N = 344447;
		int[] coords = new int[] { 132, 51717, 628, 344447, 628, 51717, 344447, 2 };
		String moves = "+-++-+--";

		String expected = "NOT VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int N = 1;
		int[] coords = new int[] { 1, 1 };
		String moves = "+-";

		String expected = "NOT VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int N = 990630;
		int[] coords = new int[] { 833196, 524568, 361663, 108056, 28026, 824639, 269315, 440977, 440977, 765458, 988451, 242440, 948414, 130873, 773990, 765458, 130873, 28026,
				853121, 553636, 581069, 82254, 735536, 833196, 898562, 898562, 940783, 988451, 540613, 317306, 623194, 940783, 571384, 988451, 108056, 514374, 97664 };
		String moves = "--+---+-+++-+-+---++-++-+---+-+--+-++";

		String expected = "NOT VALID";
		String actual = solution.isValid(N, coords, moves);

		Assert.assertEquals(expected, actual);
	}

}
