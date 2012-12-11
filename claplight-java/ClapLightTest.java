import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClapLightTest {

    protected ClapLight solution;

    @Before
    public void setUp() {
        solution = new ClapLight();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] background = new int[]{6, 6, 6, 6, 6};

        int expected = 7;
        int actual = solution.threshold(background);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] background = new int[]{5, 8, 7, 6, 12, 8, 4, 3, 2, 6};

        int expected = 9;
        int actual = solution.threshold(background);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] background = new int[]{8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};

        int expected = 2;
        int actual = solution.threshold(background);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] background = new int[]{921, 1, 5, 900, 8, 813, 3, 3, 3, 3, 3, 3, 3, 813, 813};

        int expected = 4;
        int actual = solution.threshold(background);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] background = new int[]{921, 1, 5, 900, 8, 813, 3, 3, 3, 3, 3, 3, 3, 813, 813, 4};

        int expected = 814;
        int actual = solution.threshold(background);

        Assert.assertEquals(expected, actual);
    }
}
