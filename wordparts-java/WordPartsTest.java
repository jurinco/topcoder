import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordPartsTest {

	protected WordParts solution;

	@Before
	public void setUp() {
		solution = new WordParts();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String original = "ANTIDISESTABLISHMENTARIANISM";
		String compound = "ANTIDISIANISMISM";

		int expected = 3;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String original = "ANTIDISESTABLISHMENTARIANISM";
		String compound = "ESTABLISHMENT";

		int expected = -1;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String original = "TOPCODERDOTCOM";
		String compound = "TOMTMODERDOTCOM";

		int expected = 5;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String original = "HELLO";
		String compound = "HELLOHEHELLOLOHELLO";

		int expected = 5;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String original = "DONTFORGETTHEEMPTYCASE";
		String compound = "";

		int expected = 0;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String original = "BAAABA";
		String compound = "BAAABAAA";

		int expected = 2;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String original = "ABBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABB";
		String compound = "BBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABAA";

		int expected = 17;
		int actual = solution.partCount(original, compound);

		Assert.assertEquals(expected, actual);
	}

}
