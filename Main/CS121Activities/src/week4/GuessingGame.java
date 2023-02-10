package week4;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int i = 1;
        int startnum = 54;

        while (i >= 0) {
            System.out.println("Guess a number between 1 and 100 or type 'q' to quit the game");
            String input = console.nextLine();
            if (input.equals("q")){
                System.out.println("You quit the game. The number was " + startnum + ". You were at " + (i-1) + " guesses.");
                break;
            }
            else if (Integer.parseInt(input) > 100 || Integer.parseInt(input) < 1) {
                System.out.println("Invalid number.");
                i++;
            }
            else if (Integer.parseInt(input) > startnum) {
                System.out.println("Your guess is higher than the number");
                i++;
            }
            else if (Integer.parseInt(input) < startnum) {
                System.out.println("Your guess is lower than the number");
                i++; }
            else if (Integer.parseInt(input) == startnum) {
                System.out.println("You got it right! It took you " + i + " guesses!");
                break; }
            else {
                    System.out.println("Invalid input");
                    i++;
                }
        }
        console.close();

    }
}
