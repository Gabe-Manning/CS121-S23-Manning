import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your home town");
        String town = input.nextLine();
        System.out.println("Enter your home state");
        String state = input.nextLine();
        String homeTown = town.concat(", " + state);
        String upper = homeTown.toUpperCase();
        String lower = homeTown.toLowerCase();
        char letter = homeTown.charAt(4);
        int size = homeTown.length();
        Boolean empty = homeTown.isEmpty();

        System.out.printf("Hometown: %s\n", homeTown);
    }
}
