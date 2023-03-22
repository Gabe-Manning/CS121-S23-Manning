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
        Scanner console = new Scanner(System.in);
        System.out.println("If you want the array to be in ascending order, type 1. \n" +
                "If you want it to be in descending order, type 2. \n" +
                "If you type neither, it will assume you want it in ascending order.");
        int input = Integer.parseInt(console.nextLine());
        int temp;
        if (input == 2) {


            for (int i = 0; i < array.length - 1; i++) {
                for (int index = 0; index < array.length - i - 1; index++) {
                    if (array[index] < array[index + 1]) {
                        temp = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int index = 0; index < array.length - i - 1; index++) {
                    if (array[index] > array[index + 1]) {
                        temp = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}