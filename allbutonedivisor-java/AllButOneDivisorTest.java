import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AllButOneDivisorTest {

    protected AllButOneDivisor solution;

    @Before
    public void setUp() {
        solution = new AllButOneDivisor();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] divisors = new int[]{2, 3, 5};

        int expected = 6;
        int actual = solution.getMinimum(divisors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] divisors = new int[]{2, 4, 3, 9};

        int expected = 12;
        int actual = solution.getMinimum(divisors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] divisors = new int[]{3, 2, 6};

        int expected = -1;
        int actual = solution.getMinimum(divisors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] divisors = new int[]{6, 7, 8, 9, 10};

        int expected = 360;
        int actual = solution.getMinimum(divisors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] divisors = new int[]{10, 6, 15};

        int expected = -1;
        int actual = solution.getMinimum(divisors);

        Assert.assertEquals(expected, actual);
    }

}
