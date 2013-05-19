import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromesCountTest {

    protected PalindromesCount solution;

    @Before
    public void setUp() {
        solution = new PalindromesCount();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String A = "aba";
        String B = "b";

        int expected = 2;
        int actual = solution.count(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String A = "aa";
        String B = "a";

        int expected = 3;
        int actual = solution.count(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String A = "aca";
        String B = "bb";

        int expected = 0;
        int actual = solution.count(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String A = "abba";
        String B = "abba";

        int expected = 3;
        int actual = solution.count(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String A = "topcoder";
        String B = "coder";

        int expected = 0;
        int actual = solution.count(A, B);

        Assert.assertEquals(expected, actual);
    }

}
