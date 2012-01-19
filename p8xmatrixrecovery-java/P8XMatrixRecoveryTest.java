import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P8XMatrixRecoveryTest {

    protected P8XMatrixRecovery solution;

    @Before
    public void setUp() {
        solution = new P8XMatrixRecovery();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] rows = new String[]{"10?", "?11"};
        String[] columns = new String[]{"01", "10", "1?"};

        String[] expected = new String[]{"101", "011"};
        String[] actual = solution.solve(rows, columns);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] rows = new String[]{"0", "?", "1"};
        String[] columns = new String[]{"0?1"};

        String[] expected = new String[]{"0", "0", "1"};
        String[] actual = solution.solve(rows, columns);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] rows = new String[]{"10", "01"};
        String[] columns = new String[]{"10", "01"};

        String[] expected = new String[]{"10", "01"};
        String[] actual = solution.solve(rows, columns);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] rows = new String[]{"??0", "11?", "?01", "1?1"};
        String[] columns = new String[]{"1???", "?111", "0?1?"};

        String[] expected = new String[]{"010", "110", "101", "101"};
        String[] actual = solution.solve(rows, columns);

        Assert.assertArrayEquals(expected, actual);
    }

}
