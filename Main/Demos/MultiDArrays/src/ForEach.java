public class ForEach {
    public static void main(String[] args) {

        String[] names = {"Mary", "Tom", "John", "Jane", "Lisa"};

        for (String name : names) {
            System.out.printf("%s\n", name);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.printf("The total of the array elements is: %d\n", total);
    }
}
