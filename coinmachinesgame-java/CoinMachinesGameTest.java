import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinMachinesGameTest {

    protected CoinMachinesGame solution;

    @Before
    public void setUp() {
        solution = new CoinMachinesGame();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int coins = 10;
        int[] need = new int[]{5, 3};
        int[] give = new int[]{4, 1};

        int expected = 7;
        int actual = solution.maxGames(coins, need, give);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int coins = 1000;
        int[] need = new int[]{16, 14, 11, 7};
        int[] give = new int[]{15, 12, 8, 3};

        int expected = 988;
        int actual = solution.maxGames(coins, need, give);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int coins = 1000000000;
        int[] need = new int[]{1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
        int[] give = new int[]{701, 802, 503, 604, 405, 306, 107, 208, 1, 1};

        int expected = 10869564;
        int actual = solution.maxGames(coins, need, give);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int coins = 12345678;
        int[] need = new int[]{342, 234, 65, 76, 85, 734, 67, 345, 70, 234};
        int[] give = new int[]{45, 78, 3, 10, 45, 12, 45, 57, 1, 230};

        int expected = 3086370;
        int actual = solution.maxGames(coins, need, give);

        Assert.assertEquals(expected, actual);
    }

}
