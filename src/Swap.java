public class Swap {

    public static int[][] swapPosition(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        int min = 9999;
        int max = -9999;
        int jIndexMax = 0;
        int jIndexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <= min) {
                    min = arr[i][j];
                    jIndexMin = j;
                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                    jIndexMax = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            newArr[i][jIndexMax] = newArr[i][jIndexMin];
            newArr[i][jIndexMin] = arr[i][jIndexMax];
        }

        return newArr;
    }

}
