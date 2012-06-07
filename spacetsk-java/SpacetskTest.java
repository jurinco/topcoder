import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpacetskTest {

	protected Spacetsk solution;

	@Before
	public void setUp() {
		solution = new Spacetsk();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int L = 1;
		int H = 1;
		int K = 2;

		int expected = 4;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int L = 1;
		int H = 1;
		int K = 1;

		int expected = 4;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int L = 2;
		int H = 2;
		int K = 1;

		int expected = 9;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int L = 2;
		int H = 2;
		int K = 2;

		int expected = 23;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int L = 5;
		int H = 5;
		int K = 3;

		int expected = 202;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int L = 561;
		int H = 394;
		int K = 20;

		int expected = 786097180;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		int L = 1830;
		int H = 1428;
		int K = 1131;

		int expected = 233464949;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		int L = 2000;
		int H = 2000;
		int K = 348;

		int expected = 133105885;
		int actual = solution.countsets(L, H, K);

		Assert.assertEquals(expected, actual);
	}
}
