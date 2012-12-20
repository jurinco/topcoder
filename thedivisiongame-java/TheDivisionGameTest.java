import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheDivisionGameTest {

    protected TheDivisionGame solution;

    @Before
    public void setUp() {
        solution = new TheDivisionGame();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int L = 9;
        int R = 10;

        long expected = 2L;
        long actual = solution.countWinningIntervals(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int L = 2;
        int R = 5;

        long expected = 9L;
        long actual = solution.countWinningIntervals(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int L = 2;
        int R = 6;

        long expected = 13L;
        long actual = solution.countWinningIntervals(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int L = 2;
        int R = 100;

        long expected = 4345L;
        long actual = solution.countWinningIntervals(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int L = 12566125;
        int R = 12567777;

        long expected = 1313432L;
        long actual = solution.countWinningIntervals(L, R);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCaseBig() {
        int L = 1000000000;
        int R = L + 1000000;

        solution.countWinningIntervals(L, R);
    }

}
