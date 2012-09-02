import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoredPhilosophersTest {

	protected BoredPhilosophers solution;

	@Before
	public void setUp() {
		solution = new BoredPhilosophers();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] text = new String[] { "hello world" };
		int N = 2;

		int[] expected = new int[] { 2, 1 };
		int[] actual = solution.simulate(text, N);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] text = new String[] { "aaa bbb aaa bbb aaa aaa" };
		int N = 4;

		int[] expected = new int[] { 2, 3, 3, 3 };
		int[] actual = solution.simulate(text, N);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] text = new String[] { "remember", " t", "o concatenate ", "the", " ", "text" };
		int N = 1;

		int[] expected = new int[] { 5 };
		int[] actual = solution.simulate(text, N);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] text = new String[] { "a a a a a a a b a a b a a a b b a b a a a b a b" };
		int N = 6;

		int[] expected = new int[] { 2, 4, 7, 11, 14, 17 };
		int[] actual = solution.simulate(text, N);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] text = new String[] { "aa ababaa c cbbcbc cabcbcb ba bccc ababb", "c cabcba caa ababaa c cbbcbc cabcbcb ba ", "bccc ababbc cabcba c bbcbab",
				"b aaaa cbccaaa bccc ababbc cabcba c bbcb", "ab cbcaca" };
		int N = 7;

		int[] expected = new int[] { 15, 17, 18, 19, 20, 20, 20 };
		int[] actual = solution.simulate(text, N);

		Assert.assertArrayEquals(expected, actual);
	}

}
