import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calories calories = new Calories();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the calories eaten per day:");
        double daily = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the start date as mm/dd/yyyy:");
        String start = scanner.nextLine();
        System.out.println("Enter the end date as mm/dd/yyyy:");
        String end = scanner.nextLine();

        double total = calories.calcCalories(daily, start, end);
        System.out.printf("Total calories eaten over the diet = %.0f", total);
    }
}
