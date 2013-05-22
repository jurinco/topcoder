import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LotteryTicketTest {

    protected LotteryTicket solution;

    @Before
    public void setUp() {
        solution = new LotteryTicket();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int price = 10;
        int b1 = 1;
        int b2 = 5;
        int b3 = 10;
        int b4 = 50;

        String expected = "POSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int price = 15;
        int b1 = 1;
        int b2 = 5;
        int b3 = 10;
        int b4 = 50;

        String expected = "POSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int price = 65;
        int b1 = 1;
        int b2 = 5;
        int b3 = 10;
        int b4 = 50;

        String expected = "POSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int price = 66;
        int b1 = 1;
        int b2 = 5;
        int b3 = 10;
        int b4 = 50;

        String expected = "POSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int price = 1000;
        int b1 = 999;
        int b2 = 998;
        int b3 = 997;
        int b4 = 996;

        String expected = "IMPOSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int price = 20;
        int b1 = 5;
        int b2 = 5;
        int b3 = 5;
        int b4 = 5;

        String expected = "POSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int price = 2;
        int b1 = 1;
        int b2 = 5;
        int b3 = 10;
        int b4 = 50;

        String expected = "IMPOSSIBLE";
        String actual = solution.buy(price, b1, b2, b3, b4);

        Assert.assertEquals(expected, actual);
    }

}
