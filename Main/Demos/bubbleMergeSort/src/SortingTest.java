public class SortingTest {
    public static void main(String[] args) {
        Sorting sorter = new Sorting();

        int[] array = {1, 2, 78, 9, 21,10, 0, 100, 43};

        /*int[] array = {30, 16, 24, 62, 25,7};

        System.out.print("Unsorted: ");
        printArray(array);

        System.out.println();

        sorter.ascendingBubbleSort(array);
        System.out.print("Sorted ascending: ");
        printArray(array);

        System.out.println();

        sorter.descendingBubbleSort(array);
        System.out.print("Sorted descending: ");
        printArray(array);

        System.out.println();



        int[] array = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        sorter.mergeSort(array);
        printArray(array);

        int[] array = {1, 2, 78, 9, 21,10, 0, 100, 43};
        sorter.selectionSort(array);
        printArray(array);

        sorter.insertionSort(array);
        printArray(array); */

        sorter.quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
