import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StreetParkingTest {

	protected StreetParking solution;

	@Before
	public void setUp() {
		solution = new StreetParking();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String street = "---B--S-D--S--";

		int expected = 4;
		int actual = solution.freeParks(street);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String street = "DDBDDBDDBDD";

		int expected = 0;
		int actual = solution.freeParks(street);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String street = "--S--S--S--S--";

		int expected = 2;
		int actual = solution.freeParks(street);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String street = "SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D";

		int expected = 14;
		int actual = solution.freeParks(street);

		Assert.assertEquals(expected, actual);
	}

}
