
import java.util.Scanner;

import static java.lang.System.out;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
        Scanner console = new Scanner((System.in));
        String percentage = null;
        double gpa = 0;

        out.println("Enter a letter grade");
        char letterGrade = console.next().charAt(0);

        switch (letterGrade) {
            case 'A':
                percentage = "90-100";
                gpa = 4.0;
                break;
            case 'B':
                percentage = "80-89";
                gpa = 3.0;
                break;
            case 'C':
                percentage = "70-79";
                gpa = 2.0;
                break;
            case 'D':
                percentage = "60-69";
                gpa = 1.0;
                break;
            case 'F':
                percentage = "0-59";
                gpa = 0.0;
                break;
        }
        out.println("Letter Grade: " + letterGrade + "\nPercentage: " + percentage + "\nGPA: " + gpa);
        console.close();

         */

        Scanner console = new Scanner(System.in);
        out.println("What is the current month as a number?");
        int month = Integer.parseInt(console.nextLine());
        out.println("What is the current year?");
        int year = Integer.parseInt(console.nextLine());
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 ==0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else numDays = 28;
                break;
            default:
                out.println("Invalid month");
                break;
        }
        out.printf("Number of Days = " + numDays);
        console.close();
    }

}
