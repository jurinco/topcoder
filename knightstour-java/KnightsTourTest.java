import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KnightsTourTest {

    protected KnightsTour solution;

    @Before
    public void setUp() {
        solution = new KnightsTour();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"........", ".*.*....", ".*......", "..K...*.", "*...*...", "...*....", "...*.*..", "........"};

        int expected = 39;
        int actual = solution.visitedPositions(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"K.......", "........", "........", "........", "........", "........", "........", "........"};

        int expected = 64;
        int actual = solution.visitedPositions(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"********", "*******.", "********", "**.***.*", "********", "***.*.**", "********", "****K***"};

        int expected = 3;
        int actual = solution.visitedPositions(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"*.*....*", ".......*", "**...*..", "..***...", ".**.*...", "..*.*..K", "..***.*.", "**...*.."};

        int expected = 17;
        int actual = solution.visitedPositions(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"..*...*.", "**.....*", "*..*....", "*..*....", ".....*..", "....*..K", "**.*...*", "..**...."};

        int expected = 27;
        int actual = solution.visitedPositions(board);

        Assert.assertEquals(expected, actual);
    }

}
