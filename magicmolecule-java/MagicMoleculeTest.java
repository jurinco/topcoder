import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicMoleculeTest {

	protected MagicMolecule solution;

	@Before
	public void setUp() {
		solution = new MagicMolecule();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int[] magicPower = new int[] { 1, 2, 3 };
		String[] magicBond = new String[] { "NYY", "YNN", "YNN" };

		int expected = 4;
		int actual = solution.maxMagicPower(magicPower, magicBond);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int[] magicPower = new int[] { 1, 1, 1, 1 };
		String[] magicBond = new String[] { "NNYY", "NNYY", "YYNN", "YYNN" };

		int expected = -1;
		int actual = solution.maxMagicPower(magicPower, magicBond);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int[] magicPower = new int[] { 86, 15, 100, 93, 53, 50 };
		String[] magicBond = new String[] { "NYYYYN", "YNNNNY", "YNNYYN", "YNYNYN", "YNYYNY", "NYNNYN" };

		int expected = 332;
		int actual = solution.maxMagicPower(magicPower, magicBond);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int[] magicPower = new int[] { 3969, 9430, 7242, 8549, 8190, 8368, 3704, 9740, 1691 };
		String[] magicBond = new String[] { "NYYYYYYYY", "YNYYYYYYY", "YYNYYYYYY", "YYYNYYYYY", "YYYYNYYYY", "YYYYYNYYY", "YYYYYYNNY", "YYYYYYNNY", "YYYYYYYYN" };

		int expected = 57179;
		int actual = solution.maxMagicPower(magicPower, magicBond);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int[] magicPower = new int[] { 2, 1, 1, 10 };
		String[] magicBond = new String[] { "NNYN", "NNYY", "NYNY", "NYYN" };

		int expected = 12;
		int actual = solution.maxMagicPower(magicPower, magicBond);

		Assert.assertEquals(expected, actual);
	}
}
