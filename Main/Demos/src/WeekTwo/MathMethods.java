import java.util.Scanner;
public class MathMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an integer");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Choose another integer");
        int y = Integer.parseInt(input.nextLine());
        System.out.println("Choose a real number with 2 decimal places");
        double z = Double.parseDouble(input.nextLine());

        System.out.printf("Maximum of x and y is %d", Math.max(x, y));
        System.out.printf("Minimum of x and y is %d", Math.min(x, y));
        System.out.printf("Square root of z is %d", Math.sqrt(z));




    }
}
