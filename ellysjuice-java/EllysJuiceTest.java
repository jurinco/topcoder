import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysJuiceTest {

    protected EllysJuice solution;

    @Before
    public void setUp() {
        solution = new EllysJuice();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] players = new String[]{"elly", "kriss", "stancho", "elly", "stancho"};

        String[] expected = new String[]{"elly", "stancho"};
        String[] actual = solution.getWinners(players);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] players = new String[]{"torb", "elly", "stancho", "kriss"};

        String[] expected = new String[]{};
        String[] actual = solution.getWinners(players);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] players = new String[]{"elly", "elly", "elly", "elly", "elly"};

        String[] expected = new String[]{"elly"};
        String[] actual = solution.getWinners(players);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] players = new String[]{"ariadne", "elly", "ariadne", "stancho", "stancho", "kriss", "stancho", "elly"};

        String[] expected = new String[]{"ariadne", "elly", "stancho"};
        String[] actual = solution.getWinners(players);

        Assert.assertArrayEquals(expected, actual);
    }

}
