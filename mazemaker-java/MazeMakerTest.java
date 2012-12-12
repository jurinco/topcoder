import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MazeMakerTest {

    protected MazeMaker solution;

    @Before
    public void setUp() {
        solution = new MazeMaker();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] maze = new String[]{"...", "...", "..."};
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = new int[]{1, 0, -1, 0};
        int[] moveCol = new int[]{0, 1, 0, -1};

        int expected = 3;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] maze = new String[]{"...", "...", "..."};
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = new int[]{1, 0, -1, 0, 1, 1, -1, -1};
        int[] moveCol = new int[]{0, 1, 0, -1, 1, -1, 1, -1};

        int expected = 2;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] maze = new String[]{"X.X", "...", "XXX", "X.X"};
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = new int[]{1, 0, -1, 0};
        int[] moveCol = new int[]{0, 1, 0, -1};

        int expected = -1;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] maze = new String[]{".......", "X.X.X..", "XXX...X", "....X..", "X....X.", "......."};
        int startRow = 5;
        int startCol = 0;
        int[] moveRow = new int[]{1, 0, -1, 0, -2, 1};
        int[] moveCol = new int[]{0, -1, 0, 1, 3, 0};

        int expected = 7;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] maze = new String[]{"......."};
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = new int[]{1, 0, 1, 0, 1, 0};
        int[] moveCol = new int[]{0, 1, 0, 1, 0, 1};

        int expected = 6;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] maze = new String[]{"..X.X.X.X.X.X."};
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = new int[]{2, 0, -2, 0};
        int[] moveCol = new int[]{0, 2, 0, -2};

        int expected = -1;
        int actual = solution.longestPath(maze, startRow, startCol, moveRow, moveCol);

        Assert.assertEquals(expected, actual);
    }

}
