import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EducationTest {

    protected Education solution;

    @Before
    public void setUp() {
        solution = new Education();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String desire = "A";
        int[] tests = new int[]{0, 70};

        int expected = -1;
        int actual = solution.minimize(desire, tests);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String desire = "D";
        int[] tests = new int[]{100, 100, 100, 100, 100, 100};

        int expected = 0;
        int actual = solution.minimize(desire, tests);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String desire = "B";
        int[] tests = new int[]{80, 80, 80, 73};

        int expected = 87;
        int actual = solution.minimize(desire, tests);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String desire = "B";
        int[] tests = new int[]{80, 80, 80, 73, 79};

        int expected = 88;
        int actual = solution.minimize(desire, tests);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String desire = "A";
        int[] tests = new int[]{80};

        int expected = 100;
        int actual = solution.minimize(desire, tests);

        Assert.assertEquals(expected, actual);
    }

}
