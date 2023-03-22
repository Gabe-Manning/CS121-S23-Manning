import java.util.Scanner;
public class RecursionTester {

    public static void main(String[] args) {

        RecursionDemo demo = new RecursionDemo();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = Integer.parseInt(console.nextLine());
        System.out.println(demo.calcFactorial(number));

    }
}
