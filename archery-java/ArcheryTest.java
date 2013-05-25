import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArcheryTest {

    protected Archery solution;

    @Before
    public void setUp() {
        solution = new Archery();
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
        int N = 1;
        int[] ringPoints = new int[]{10, 0};

        double expected = 2.5;
        double actual = solution.expectedPoints(N, ringPoints);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 3;
        int[] ringPoints = new int[]{1, 1, 1, 1};

        double expected = 1.0;
        double actual = solution.expectedPoints(N, ringPoints);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 4;
        int[] ringPoints = new int[]{100, 0, 100, 0, 100};

        double expected = 60.0;
        double actual = solution.expectedPoints(N, ringPoints);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 9;
        int[] ringPoints = new int[]{69, 50, 79, 16, 52, 71, 17, 96, 56, 32};

        double expected = 51.96;
        double actual = solution.expectedPoints(N, ringPoints);

        assertEquals(expected, actual);
    }

}
