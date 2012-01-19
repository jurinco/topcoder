import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicBlizzardTest {

    protected MagicBlizzard solution;

    @Before
    public void setUp() {
        solution = new MagicBlizzard();
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
        int[] range = new int[]{1, 0};
        int[] amount = new int[]{1, 1};

        double expected = 2.2222222222222223;
        double actual = solution.expectation(range, amount);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] range = new int[]{1, 0};
        int[] amount = new int[]{2, 1};

        double expected = 3.666666666666667;
        double actual = solution.expectation(range, amount);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] range = new int[]{5, 2, 6, 5};
        int[] amount = new int[]{1, 2, 2, 3};

        double expected = 8.46525111252384;
        double actual = solution.expectation(range, amount);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] range = new int[]{7, 11, 2, 13, 3, 19, 5, 17};
        int[] amount = new int[]{16, 8, 4, 15, 12, 9, 10, 6};

        double expected = 98.55659436211914;
        double actual = solution.expectation(range, amount);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] range = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] amount = new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};

        double expected = 1.0E10;
        double actual = solution.expectation(range, amount);

        assertEquals(expected, actual);
    }

}
