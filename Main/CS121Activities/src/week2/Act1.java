package week2;


//Act 1, Gabe Manning, CS121

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Act1 {

    public static void main(String[] args) {

        part2Math();
        part1Names();
        System.out.println("This is a test");

    }
    public static void part1Names() {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = console.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = console.nextLine();
        String name = firstName + " " + lastName;

        System.out.printf("Full name: %s %s", firstName, lastName);
        System.out.printf("\nlowercase: %s %s", firstName.toLowerCase(), lastName.toLowerCase());
        System.out.printf("\nUPPERCASE: %s %s", firstName.toUpperCase(), lastName.toUpperCase());
        StringBuilder x = new StringBuilder(name);
        System.out.printf("\nesreveR: %s ", x.reverse());

        console.close();

    }

    public static void part2Math()
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Choose an integer"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Choose another integer"));

        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(Math.sqrt(x));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.pow(x, 2));
        System.out.println(Math.pow(y, 2));
        System.out.println(Math.log(x));
        System.out.println(Math.log(y));
    }


}
