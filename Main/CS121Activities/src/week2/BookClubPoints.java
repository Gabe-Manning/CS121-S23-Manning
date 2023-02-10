package week2;

import javax.swing.JOptionPane;
public class BookClubPoints {

    public static void main(String[] args) {




         int book = Integer.parseInt(JOptionPane.showInputDialog("How many books did you purchase this month?"));

         if (book == 0)
            System.out.printf("You earned 0 points");
        else if (book == 1)
             System.out.printf("You earned 5 points");
        else if (book == 2)
             System.out.printf("You earned 15 points");
        else if (book == 3)
             System.out.printf("You earned 30 points");
        else
             System.out.printf("You earned 60 points");
    }
}
