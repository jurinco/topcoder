import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GogoXMarisaKirisimaTest {

	protected GogoXMarisaKirisima solution;

	/*
	 * @Before public void setUp() { solution = new GogoXMarisaKirisima(); }
	 *
	 * @Test(timeout = 2000) public void testCase0() { String[] choices = new
	 * String[]{"NYN", "YNY", "NNN"};
	 *
	 * int expected = 2; int actual = solution.solve(choices);
	 *
	 * Assert.assertEquals(expected, actual); }
	 *
	 * @Test(timeout = 2000) public void testCase1() { String[] choices = new
	 * String[]{"NNY", "YNY", "YNN"};
	 *
	 * int expected = 2; int actual = solution.solve(choices);
	 *
	 * Assert.assertEquals(expected, actual); }
	 *
	 * @Test(timeout = 2000) public void testCase2() { String[] choices = new
	 * String[]{"NN", "NN"};
	 *
	 * int expected = 0; int actual = solution.solve(choices);
	 *
	 * Assert.assertEquals(expected, actual); }
	 *
	 * @Test(timeout = 2000) public void testCase3() { String[] choices = new
	 * String[]{"NYYY", "NNNY", "NNNY", "NNNN"};
	 *
	 * int expected = 3; int actual = solution.solve(choices);
	 *
	 * Assert.assertEquals(expected, actual); }
	 */
	@Test(timeout = 2000)
	public void testCaseBig() {
		int size = 20;

		String[] choices = new String[size];
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < size; i++) {
			b.append("{");
			for (int j = 0; j < size; j++) {
				if (i == j)
					b.append('N');
				else
					b.append('Y');
				if (j < size - 1)
					b.append(",");
			}
			b.append("}");
			if (i < size - 1)
				b.append(',');
		}

		System.out.println(b.toString());

		int expected = 3;
		// int actual = solution.solve(choices);

		//  Assert.assertEquals(expected, actual);
	}

}
