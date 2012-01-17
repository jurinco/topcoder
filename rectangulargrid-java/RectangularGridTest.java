import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangularGridTest {

    protected RectangularGrid solution;

    @Before
    public void setUp() {
        solution = new RectangularGrid();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int width = 3;
        int height = 3;

        long expected = 22L;
        long actual = solution.countRectangles(width, height);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int width = 5;
        int height = 2;

        long expected = 31L;
        long actual = solution.countRectangles(width, height);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int width = 10;
        int height = 10;

        long expected = 2640L;
        long actual = solution.countRectangles(width, height);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int width = 1;
        int height = 1;

        long expected = 0L;
        long actual = solution.countRectangles(width, height);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int width = 592;
        int height = 964;

        long expected = 81508708664L;
        long actual = solution.countRectangles(width, height);

        Assert.assertEquals(expected, actual);
    }

}
