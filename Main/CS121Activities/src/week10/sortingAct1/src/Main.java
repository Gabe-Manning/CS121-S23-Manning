public class Main {
    public static void main(String[] args) {
        Sorting sorter = new Sorting();

        int[] array = Sorting.getArray();
        System.out.print("Unsorted array: ");
        Sorting.printArray(array);

        System.out.println();

        int[] sorted= Sorting.sortArray(array);
        System.out.print("Sorted array: ");
        Sorting.printArray(sorted);
    }
}
