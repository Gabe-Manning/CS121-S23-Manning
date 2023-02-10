package week3;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Pick a number");
        int num = Integer.parseInt(console.next());

        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        console.close();
    }

}
