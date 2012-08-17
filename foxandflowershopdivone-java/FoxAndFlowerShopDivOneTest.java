import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndFlowerShopDivOneTest {

	protected FoxAndFlowerShopDivOne solution;

	@Before
	public void setUp() {
		solution = new FoxAndFlowerShopDivOne();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] flowers = new String[] { "LLL", "PPP", "LLL" };
		int maxDiff = 1;

		int expected = 7;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] flowers = new String[] { "LLL", "PPP", "LLL" };
		int maxDiff = 0;

		int expected = 6;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] flowers = new String[] { "...", "...", "..." };
		int maxDiff = 3;

		int expected = 0;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] flowers = new String[] { "LLPL.LPP", "PLPPPPLL", "L.P.PLLL", "LPL.PP.L", ".LLL.P.L", "PPLP..PL" };
		int maxDiff = 2;

		int expected = 38;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] flowers = new String[] { "LLLLLLLLLL", "LLLLLLLLLL", "LLLLLLLLLL", "LLLLLLLLLL", "LLLLLLLLLL" };
		int maxDiff = 0;

		int expected = -1;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String[] flowers = new String[] { "LLLP..LLP.PLL.LL..LP", "L.PL.L.LLLL.LPLLPLP.", "PLL.LL.LLL..PL...L..", ".LPPP.PPPLLLLPLP..PP", "LP.P.PPL.L...P.L.LLL",
				"L..LPLPP.PP...PPPL..", "PP.PLLL.LL...LP..LP.", "PL...P.PPPL..PLP.L..", "P.PPPLPLP.LL.L.LLLPL", "PLLPLLP.LLL.P..P.LPL", "..LLLPLPPPLP.P.LP.LL",
				"..LP..L..LLPPP.LL.LP", "LPLL.PLLPPLP...LL..P", "LL.....PLL.PLL.P....", "LLL...LPPPPL.PL...PP", ".PLPLLLLP.LPP...L...", "LL...L.LL.LLLPLPPPP.",
				"PLPLLLL..LP.LLPLLLL.", "PP.PLL..L..LLLPPL..P", ".LLPL.P.PP.P.L.PLPLL" };
		int maxDiff = 9;

		int expected = 208;
		int actual = solution.theMaxFlowers(flowers, maxDiff);

		Assert.assertEquals(expected, actual);
	}

}
