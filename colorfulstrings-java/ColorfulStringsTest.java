import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorfulStringsTest {

    protected ColorfulStrings solution;

    @Before
    public void setUp() {
        solution = new ColorfulStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 3;
        int k = 4;

        String expected = "238";
        String actual = solution.getKth(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 4;
        int k = 2000;

        String expected = "";
        String actual = solution.getKth(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 5;
        int k = 1;

        String expected = "23457";
        String actual = solution.getKth(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 2;
        int k = 22;

        String expected = "52";
        String actual = solution.getKth(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int n = 6;
        int k = 464;

        String expected = "257936";
        String actual = solution.getKth(n, k);

        Assert.assertEquals(expected, actual);
    }

}
