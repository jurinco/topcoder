import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimalDifferenceTest {

    protected MinimalDifference solution;

    @Before
    public void setUp() {
        solution = new MinimalDifference();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int A = 1;
        int B = 9;
        int C = 10;

        int expected = 1;
        int actual = solution.findNumber(A, B, C);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int A = 11;
        int B = 20;
        int C = 20;

        int expected = 11;
        int actual = solution.findNumber(A, B, C);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int A = 1;
        int B = 1;
        int C = 999;

        int expected = 1;
        int actual = solution.findNumber(A, B, C);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int A = 100;
        int B = 1000;
        int C = 99;

        int expected = 189;
        int actual = solution.findNumber(A, B, C);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int A = 1987;
        int B = 9123;
        int C = 1;

        int expected = 2000;
        int actual = solution.findNumber(A, B, C);

        Assert.assertEquals(expected, actual);
    }

}
