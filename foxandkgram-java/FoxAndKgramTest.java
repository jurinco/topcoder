import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndKgramTest {

    protected FoxAndKgram solution;

    @Before
    public void setUp() {
        solution = new FoxAndKgram();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] len = new int[]{1, 1, 1, 1, 3};

        int expected = 3;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] len = new int[]{2, 2, 1, 3, 5, 5, 5};

        int expected = 5;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] len = new int[]{1};

        int expected = 1;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] len = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        int expected = 5;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] len = new int[]{1, 2, 3, 1, 2, 4, 2, 3, 1};

        int expected = 4;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] len = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        int expected = 0;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] len = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 2, 3, 5, 7, 11, 13, 17, 19, 23, 50, 2, 3, 5, 7, 11, 13, 17, 19, 23, 50, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        int expected = 11;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase7() {
        int[] len = new int[]{5, 1};

        int expected = 1;
        int actual = solution.maxK(len);

        Assert.assertEquals(expected, actual);
    }
}
