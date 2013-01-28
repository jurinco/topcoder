import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FeudaliasBattleTest {

	protected FeudaliasBattle solution;

	@Before
	public void setUp() {
		solution = new FeudaliasBattle();
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
		int[] baseX = new int[] { 100, 500 };
		int[] baseY = new int[] { 100, 100 };
		int[] siloX = new int[] { 100, 500 };
		int[] siloY = new int[] { 300, 300 };
		int takeOffTime = 6;
		int rechargeTime = 10;
		int missileSpeed = 1;

		double expected = 200.1;
		double actual = solution.getMinimumTime(baseX, baseY, siloX, siloY, takeOffTime, rechargeTime, missileSpeed);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] baseX = new int[] { 100, 100 };
		int[] baseY = new int[] { 100, 500 };
		int[] siloX = new int[] { 100, 500 };
		int[] siloY = new int[] { 300, 300 };
		int takeOffTime = 6;
		int rechargeTime = 10;
		int missileSpeed = 1;

		double expected = 210.2;
		double actual = solution.getMinimumTime(baseX, baseY, siloX, siloY, takeOffTime, rechargeTime, missileSpeed);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] baseX = new int[] { 100, 100 };
		int[] baseY = new int[] { 100, 500 };
		int[] siloX = new int[] { 100, 500 };
		int[] siloY = new int[] { 300, 300 };
		int takeOffTime = 6;
		int rechargeTime = 20;
		int missileSpeed = 20;

		double expected = 22.4606797749979;
		double actual = solution.getMinimumTime(baseX, baseY, siloX, siloY, takeOffTime, rechargeTime, missileSpeed);

		assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] baseX = new int[] { 401, 208 };
		int[] baseY = new int[] { 622, 603 };
		int[] siloX = new int[] { 51, 387 };
		int[] siloY = new int[] { 411, 828 };
		int takeOffTime = 59;
		int rechargeTime = 518;
		int missileSpeed = 1941;

		double expected = 1.1111118724871378;
		double actual = solution.getMinimumTime(baseX, baseY, siloX, siloY, takeOffTime, rechargeTime, missileSpeed);

		assertEquals(expected, actual);
	}

}
