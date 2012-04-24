import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AkariDaisukiDiv1Test {

	protected AkariDaisukiDiv1 solution;

	@Before
	public void setUp() {
		solution = new AkariDaisukiDiv1();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "x";
		String F = "axb";
		int k = 2;

		int expected = 2;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "x";
		String F = "abcdefghij";
		int k = 1;

		int expected = 0;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String Waai = "a";
		String Akari = "a";
		String Daisuki = "a";
		String S = "b";
		String F = "aba";
		int k = 2;

		int expected = 4;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String Waai = "a";
		String Akari = "b";
		String Daisuki = "c";
		String S = "d";
		String F = "baadbdcbadbdccccbaaaadbdcbadbdccbaadbdcba";
		int k = 58;

		int expected = 191690599;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String Waai = "a";
		String Akari = "x";
		String Daisuki = "y";
		String S = "b";
		String F = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		int k = 49;

		int expected = 1;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String Waai = "waai";
		String Akari = "akari";
		String Daisuki = "daisuki";
		String S = "usushio";
		String F = "id";
		int k = 10000000;

		int expected = 127859200;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String Waai = "vfsebgjfyfgerkqlr";
		String Akari = "ezbiwls";
		String Daisuki = "kjerx";
		String S = "jbmjvaawoxycfndukrjfg";
		String F = "bgjfyfgerkqlrvfsebgjfyfgerkqlrvfsebgjfyfgerkqlrvfs";
		int k = 1575724;

		int expected = 483599313;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		String Waai = "zwytoxfsnjbmqfbllfirenpudiobwczzquavzh";
		String Akari = "lqtuzbtzxpfxrdudckhsjrdompxjqcmao";
		String Daisuki = "scz";
		String S = "dmxzplfgeqsyikwxjyzhjrgbhrvfycvcuwvfumxszj";
		String F = "renpudiobwczzquavzhzwytoxfsnjbmqfbllfirenpudi";
		int k = 7062634;

		int expected = 246329304;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase8() {
		String Waai = "b";
		String Akari = "a";
		String Daisuki = "a";
		String S = "a";
		String F = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		int k = 10000000;

		int expected = 660743853;
		int actual = solution.countF(Waai, Akari, Daisuki, S, F, k);

		Assert.assertEquals(expected, actual);
	}

}
