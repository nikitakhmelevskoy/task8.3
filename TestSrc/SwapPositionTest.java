import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

class SwapPositionTest {

    @Test
    public void swapPositionTest1() {
        int[][] arr = ArrayUtils.readIntArray2FromFile("TestSrc/Input01.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/Output01.txt");
        int[][] factualResult = Swap.swapPosition(arr);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
    @Test
    public void swapPositionTest2() {
        int[][] arr = ArrayUtils.readIntArray2FromFile("TestSrc/Input02.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/Output02.txt");
        int[][] factualResult = Swap.swapPosition(arr);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
    @Test
    public void swapPositionTest3() {
        int[][] arr = ArrayUtils.readIntArray2FromFile("TestSrc/Input03.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/Output03.txt");
        int[][] factualResult = Swap.swapPosition(arr);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void swapPositionTest4() {
        int[][] arr = ArrayUtils.readIntArray2FromFile("TestSrc/Input04.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/Output04.txt");
        int[][] factualResult = Swap.swapPosition(arr);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
    @Test
    public void swapPositionTest5() {
        int[][] arr = ArrayUtils.readIntArray2FromFile("TestSrc/Input05.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/Output05.txt");
        int[][] factualResult = Swap.swapPosition(arr);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
}