import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KleofasTailTest {

	protected KleofasTail solution;

	@Before
	public void setUp() {
		solution = new KleofasTail();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		long K = 3L;
		long A = 4L;
		long B = 8L;

		long expected = 2L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		long K = 1L;
		long A = 23457L;
		long B = 123456L;

		long expected = 100000L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		long K = 1234567890123456L;
		long A = 10L;
		long B = 1000000L;

		long expected = 0L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		long K = 0L;
		long A = 0L;
		long B = 2L;

		long expected = 3L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		long K = 2L;
		long A = 3L;
		long B = 3L;

		long expected = 1L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		long K = 13L;
		long A = 12345L;
		long B = 67890123L;

		long expected = 8387584L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		long K = 13L;
		long A = 1L;
		long B = 1000000000000000000L;

		long expected = 8387584L;
		long actual = solution.countGoodSequences(K, A, B);

		Assert.assertEquals(expected, actual);
	}

}
