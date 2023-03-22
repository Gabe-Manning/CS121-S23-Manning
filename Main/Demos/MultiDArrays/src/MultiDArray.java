public class MultiDArray {
    public static void main(String[] args) {

        int[][] array1 = { { 1, 2, 3},
                            {4, 5, 6} };

        /*int[][] array1 = new int[2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6; */

        int[][] array2 = { {1, 2},
                            {3},
                            {4, 5, 6} };

        /*for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                System.out.printf("%d ", array1[row][column]);
            }
        } */
        /*for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                System.out.printf("%d ", array2[row][column]);
            }
        } */
        for (int[] row : array1) {
            for (int column : row) {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row : array2) {
            for (int column : row) {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
    }
}
