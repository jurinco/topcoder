import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstantRunoffTest {

    protected InstantRunoff solution;

    @Before
    public void setUp() {
        solution = new InstantRunoff();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String candidates = "ABC";
        String[] ballots = new String[]{"ACB", "BCA", "ACB", "BCA", "CBA"};

        String expected = "B";
        String actual = solution.outcome(candidates, ballots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String candidates = "DCBA";
        String[] ballots = new String[]{"ACBD", "ACBD", "ACBD", "BCAD", "BCAD", "DBCA", "CBDA"};

        String expected = "B";
        String actual = solution.outcome(candidates, ballots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String candidates = "ACB";
        String[] ballots = new String[]{"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CBA", "CAB"};

        String expected = "";
        String actual = solution.outcome(candidates, ballots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String candidates = "CAB";
        String[] ballots = new String[]{"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CAB", "CAB"};

        String expected = "A";
        String actual = solution.outcome(candidates, ballots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String candidates = "Z";
        String[] ballots = new String[]{"Z"};

        String expected = "Z";
        String actual = solution.outcome(candidates, ballots);

        Assert.assertEquals(expected, actual);
    }

}
