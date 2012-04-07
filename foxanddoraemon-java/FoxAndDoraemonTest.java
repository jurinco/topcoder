import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndDoraemonTest {

    protected FoxAndDoraemon solution;

    @Before
    public void setUp() {
        solution = new FoxAndDoraemon();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] workCost = new int[]{1, 2};
        int splitCost = 1000;

        int expected = 1002;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] workCost = new int[]{3, 6, 9, 12};
        int splitCost = 1000;

        int expected = 2012;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] workCost = new int[]{1000, 100, 10, 1};
        int splitCost = 1;

        int expected = 1001;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] workCost = new int[]{1712, 1911, 1703, 1610, 1697, 1612};
        int splitCost = 100;

        int expected = 2012;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] workCost = new int[]{3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000};
        int splitCost = 3000;

        int expected = 15000;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int[] workCost = new int[]{58};
        int splitCost = 3600;

        int expected = 58;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

    
    @Test(timeout = 2000)
    public void testCase6() {
        int[] workCost = new int[]{3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000};
        int splitCost = 2000;

        int expected = 15000;
        int actual = solution.minTime(workCost, splitCost);

        Assert.assertEquals(expected, actual);
    }

}
