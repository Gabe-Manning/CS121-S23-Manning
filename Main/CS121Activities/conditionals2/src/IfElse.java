import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfElse {

    public static void main(String[] args){
        /*boolean isStudent = true;
        System.out.println("If isStudent is true:");
        System.out.printf(" isStudent = %b\n", isStudent);
        System.out.printf(" not isStudent = %b\n\n", !isStudent);
        boolean isProfessor = false;
        System.out.println("If isProfessor is false");
        System.out.printf(" isProfessor = $b\n", isProfessor);
        System.out.printf(" not isProfessor = %b\n\n", !isProfessor);*/

        /*int age = 20;
        if (age >= 21){
            System.out.println("This will only print if this is true");
        }
        if (age % 2 == 0){
            System.out.println("This will print if the age is an even number");
        }
        if (age != 21) {
            System.out.println("This will print if age is not 21");
        } */

        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number = Integer.parseInt(console.nextLine());
        if (number % 2 == 0) {
            System.out.println("This prints if the number is even");
        }
        else {
            System.out.println("This prints if the number is odd");
        } */

        /*int testScore = Integer.parseInt(JOptionPane.showInputDialog("Enter numeric test score"));

        if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "Your Grade is F");
        }
        else if (testScore < 70) {
            JOptionPane.showMessageDialog(null, "Your Grade is D");
        }
        else if (testScore < 80) {
            JOptionPane.showMessageDialog(null, "Your Grade is C");

        }
        else if (testScore < 90) {
            JOptionPane.showMessageDialog(null, "Your Grade is B");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your Grade is A");
        }
        System.exit(0); */

        /*Scanner console = new Scanner(System.in);
        System.out.println("What is the capital of Indiana?");
        String response = console.nextLine();
        String answer = "Indianapolis";
        if (response.equals(answer)) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
        }
        console.close(); */

        int x = 10;
        int y = 20;
        int smallest;
        if (x < y) {
            smallest = x;
        }
        else {
            smallest = y;
        }
        System.out.printf("Smallest: %d\n", smallest);

        smallest = x < y ? x : y;
        System.out.printf("Smallest: %d\n", smallest);
    } }
