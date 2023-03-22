import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchTester {

    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));

        BinarySearchDemo demo = new BinarySearchDemo();

        System.out.print("Unsorted: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("Sorted: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found;
        if (key < sortedArray.get(0))
            found = -1;
        else
            found = demo.binarySearch(key, sortedArray);
        if (found == -1) {
            System.out.println("Item not found");
        } else {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
        int length = array.size();
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (array.get(j) < array.get(min)) {
                    min = j;
                }
            }
            int temp = array.get(i);
            array.set(i, array.get(min));
            array.set(min, temp);
        }

        return array;
    }
}