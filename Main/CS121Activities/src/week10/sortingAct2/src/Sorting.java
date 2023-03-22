import java.util.Scanner;
public class Sorting {

    public static int[] getArray() {
        Scanner console = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an integer:");
            array[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}