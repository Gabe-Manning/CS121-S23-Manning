package week4;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many students are there?");
        int students = Integer.parseInt(console.nextLine());

        System.out.println("How many tests did each student take?");
        int tests = Integer.parseInt(console.nextLine());

        for (int i =  1; i <= students; i++) {
            System.out.println("Student Number: " + i + "\n-----------------------");
            double totalscore = 0.0;
            for (int j = 1; j <= tests; j++) {
                System.out.println("Enter test score " + j);
                int score = Integer.parseInt(console.nextLine());
                totalscore = totalscore + score;
            }
            double average = totalscore / tests;
            System.out.println("The average for this student is " + average);
        }
    }
}
