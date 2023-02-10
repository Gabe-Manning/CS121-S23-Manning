package week2;

import javax.swing.JOptionPane;
public class TestScores {

    public static void main(String[] args) {

        double test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first test score"));
        double test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second test score"));
        double test3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third test score"));
        double average = (test1 + test2 + test3) / 3;

        System.out.printf("The average of the test scores is %s", average + "\n");

        if (average < 60)
            System.out.println("You got an F");
        else if (average < 70)
            System.out.println("You got a D");
        else if (average < 80)
            System.out.println("You got a C");
        else if (average < 90)
            System.out.println("You got a B");
        else
            System.out.println("You got an A");







    }
}
