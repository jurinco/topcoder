import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangePurseTest {

    protected ChangePurse solution;

    @Before
    public void setUp() {
        solution = new ChangePurse();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] coinTypes = new int[]{1, 25, 10};
        int value = 49;

        int[] expected = new int[]{24, 1, 0};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] coinTypes = new int[]{1, 7};
        int value = 49;

        int[] expected = new int[]{49, 0};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] coinTypes = new int[]{11, 5, 10, 1};
        int value = 109;

        int[] expected = new int[]{9, 0, 0, 10};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] coinTypes = new int[]{29210, 58420, 350520, 708072, 720035, 230, 42355, 1, 59006, 985, 236024, 163, 701040};
        int value = 929579039;

        int[] expected = new int[]{1, 5, 1, 0, 0, 126, 0, 229, 0, 0, 0, 0, 1325};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] coinTypes = new int[]{795, 5536, 26, 915, 18590, 60840, 49140, 2, 119700, 162235, 369000, 383936, 478800, 505995, 949, 95984, 455, 8, 420, 239400, 276800, 191968, 619305, 654810, 706420, 393120, 738000, 767872, 425880, 786240, 830400, 676, 4500, 851760, 957600, 648940, 1, 112, 180, 457};
        int value = 687245439;

        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1, 0, 13, 0, 0, 0, 1, 0, 0, 0, 0, 0, 894, 0, 0, 0, 0, 0, 0, 0, 0, 1, 856, 0, 0};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] coinTypes = new int[]{494208, 722376, 731798, 809064, 920448, 1, 988416, 9152, 158, 991014, 282720, 40132, 608, 143, 289755, 734, 579510, 828400, 330338, 816, 460224, 27456, 675783, 331, 436, 82368, 729, 306, 202266, 247104, 414200, 705};
        int value = 419088383;

        int[] expected = new int[]{1, 0, 0, 0, 0, 142, 423, 2, 0, 0, 0, 0, 0, 63, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0};
        int[] actual = solution.optimalCoins(coinTypes, value);

        Assert.assertArrayEquals(expected, actual);
    }

}
