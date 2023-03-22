package week7;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[][][][] array = new int[3][3][3][3];
        array[0][0][0][0] = 0;
        array[0][0][0][1] = 1;
        array[0][0][0][2] = 2;
        array[0][0][1][0] = 3;
        array[0][0][1][1] = 4;
        array[0][0][1][2] = 5;
        array[0][0][2][0] = 6;
        array[0][0][2][1] = 7;
        array[0][0][2][2] = 8;
        array[0][1][0][0] = 9;
        array[0][1][0][1] = 10;
        array[0][1][0][2] = 11;
        array[0][1][1][0] = 12;
        array[0][1][1][1] = 13;
        array[0][1][1][2] = 14;
        array[0][1][2][0] = 15;
        array[0][1][2][1] = 16;
        array[0][1][2][2] = 17;
        array[0][2][0][0] = 18;
        array[0][2][0][1] = 19;
        array[0][2][0][2] = 20;
        array[0][2][1][0] = 21;
        array[0][2][1][1] = 22;
        array[0][2][1][2] = 23;
        array[0][2][2][0] = 24;
        array[0][2][2][1] = 25;
        array[0][2][2][2] = 26;
        array[1][0][0][0] = 0;
        array[1][0][0][1] = 1;
        array[1][0][0][2] = 2;
        array[1][0][1][0] = 3;
        array[1][0][1][1] = 4;
        array[1][0][1][2] = 5;
        array[1][0][2][0] = 6;
        array[1][0][2][1] = 7;
        array[1][0][2][2] = 8;
        array[1][1][0][0] = 9;
        array[1][1][0][1] = 10;
        array[1][1][0][2] = 11;
        array[1][1][1][0] = 12;
        array[1][1][1][1] = 13;
        array[1][1][1][2] = 14;
        array[1][1][2][0] = 15;
        array[1][1][2][1] = 16;
        array[1][1][2][2] = 17;
        array[1][2][0][0] = 18;
        array[1][2][0][1] = 19;
        array[1][2][0][2] = 20;
        array[1][2][1][0] = 21;
        array[1][2][1][1] = 22;
        array[1][2][1][2] = 23;
        array[1][2][2][0] = 24;
        array[1][2][2][1] = 25;
        array[1][2][2][2] = 26;
        array[2][0][0][0] = 0;
        array[2][0][0][1] = 1;
        array[2][0][0][2] = 2;
        array[2][0][1][0] = 3;
        array[2][0][1][1] = 4;
        array[2][0][1][2] = 5;
        array[2][0][2][0] = 6;
        array[2][0][2][1] = 7;
        array[2][0][2][2] = 8;
        array[2][1][0][0] = 9;
        array[2][1][0][1] = 10;
        array[2][1][0][2] = 11;
        array[2][1][1][0] = 12;
        array[2][1][1][1] = 13;
        array[2][1][1][2] = 14;
        array[2][1][2][0] = 15;
        array[2][1][2][1] = 16;
        array[2][1][2][2] = 17;
        array[2][2][0][0] = 18;
        array[2][2][0][1] = 19;
        array[2][2][0][2] = 20;
        array[2][2][1][0] = 21;
        array[2][2][1][1] = 22;
        array[2][2][1][2] = 23;
        array[2][2][2][0] = 24;
        array[2][2][2][1] = 25;
        array[2][2][2][2] = 26;

        for (int[][][] row : array) {
            for (int column[][] : row) {
                for (int page[] : column) {
                    for (int other : page) {
                        System.out.printf("%d ", other);
                        System.out.println();
                    }
                }

            }
        }
    }
}
