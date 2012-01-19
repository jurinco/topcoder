import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplesWithLimitTest {

    protected MultiplesWithLimit solution;

    @Before
    public void setUp() {
        solution = new MultiplesWithLimit();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 8;
        int[] forbiddenDigits = new int[]{2, 3, 4, 5, 6, 7, 8, 9};

        String expected = "1000";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 9;
        int[] forbiddenDigits = new int[]{1, 3, 4, 5, 6, 7, 8, 9};

        String expected = "222...222(9 digits)";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 524;
        int[] forbiddenDigits = new int[]{5, 2, 4};

        String expected = "3668";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 10000;
        int[] forbiddenDigits = new int[]{0};

        String expected = "IMPOSSIBLE";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 1;
        int[] forbiddenDigits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String expected = "IMPOSSIBLE";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int N = 8794;
        int[] forbiddenDigits = new int[]{1, 2, 3, 5, 6, 7, 8, 9};

        String expected = "444...404(14 digits)";
        String actual = solution.minMultiples(N, forbiddenDigits);

        Assert.assertEquals(expected, actual);
    }

}
