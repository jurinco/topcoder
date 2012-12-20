import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorfulBoxesAndBallsTest {

    protected ColorfulBoxesAndBalls solution;

    @Before
    public void setUp() {
        solution = new ColorfulBoxesAndBalls();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int numRed = 2;
        int numBlue = 3;
        int onlyRed = 100;
        int onlyBlue = 400;
        int bothColors = 200;

        int expected = 1400;
        int actual = solution.getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int numRed = 2;
        int numBlue = 3;
        int onlyRed = 100;
        int onlyBlue = 400;
        int bothColors = 300;

        int expected = 1600;
        int actual = solution.getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int numRed = 5;
        int numBlue = 5;
        int onlyRed = 464;
        int onlyBlue = 464;
        int bothColors = 464;

        int expected = 4640;
        int actual = solution.getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int numRed = 1;
        int numBlue = 4;
        int onlyRed = 20;
        int onlyBlue = -30;
        int bothColors = -10;

        int expected = -100;
        int actual = solution.getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int numRed = 9;
        int numBlue = 1;
        int onlyRed = -1;
        int onlyBlue = -10;
        int bothColors = 4;

        int expected = 0;
        int actual = solution.getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);

        Assert.assertEquals(expected, actual);
    }

}
