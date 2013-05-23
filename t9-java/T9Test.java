import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class T9Test {

	protected T9 solution;

	@Before
	public void setUp() {
		solution = new T9();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] part = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] dict = new String[] { "bad" };
		String[] keystr = new String[] { "2230223" };

		String expected = "bad bad";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] part = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] dict = new String[] { "the", "tie" };
		String[] keystr = new String[] { "0843#000843#000" };

		String expected = " tie   tie   ";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] part = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] dict = new String[] { "bad", "ace", "aad", "aae", "aaf", "acf", "acd", "the", "tie" };
		String[] keystr = new String[] { "223#02", "23*#00843#0" };

		String expected = "aae bad  tie ";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] part = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] dict = new String[] { "the", "tie", "bad", "ace", "aad", "aae", "aaf", "acf", "acd" };
		String[] keystr = new String[] { "84300223#02", "23#*" };

		String expected = "the  aae bad";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] part = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] dict = new String[] { "bad", "ace", "aad", "aae", "tie", "aaf", "acf", "acd", "the" };
		String[] keystr = new String[] { "223#02", "23######" };

		String expected = "aae bad";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String[] part = new String[] { "", "rq", "lde", "yoauz", "cbfgn", "tjkpx", "wvs", "ih", "m" };
		String[] dict = new String[] { "xktgmfmoqlmivm", "hmthr", "tpjgmnmaremiwm", "tpjcmnmyrlmhvm", "xkpnmgmzqdmhsm", "wqopvvmiig", "melbcbqeeg", "jkxnmbmardmhwm",
				"kpxnmcmyqlmism", "wrztvsmhhf", "srztssmiic", "pxtgmfmyrdmhwm", "vqoxswmiin", "wryksvmihb", "ptjfmbmoremhvm" };
		String[] keystr = new String[] { "00", "7246779885##00000089682000007246779885##0000724677", "9885#000089682000093355523350066659594239879###000" };

		String expected = "  wqopvvmiig      hmthr     wqopvvmiig    vqoxswmiin    hmthr    melbcbqeeg  pxtgmfmyrdmhwm   ";
		String actual = solution.message(part, dict, keystr);

		Assert.assertEquals(expected, actual);
	}

}
