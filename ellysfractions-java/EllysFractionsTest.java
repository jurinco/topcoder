import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysFractionsTest {

    protected EllysFractions solution;

    @Before
    public void setUp() {
        solution = new EllysFractions();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 1;

        long expected = 0L;
        long actual = solution.getCount(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 2;

        long expected = 1L;
        long actual = solution.getCount(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 3;

        long expected = 3L;
        long actual = solution.getCount(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 5;

        long expected = 9L;
        long actual = solution.getCount(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 100;

        long expected = 177431885L;
        long actual = solution.getCount(N);

        Assert.assertEquals(expected, actual);
    }

}
