import java.util.Scanner;
public class CharacterCountDemo {
    public static void main(String[] args) {

        CharacterCount charcount = new CharacterCount();

        char[] array = {'a', 'b', 'c', 'd', 'a', 'b', 'a'};


        System.out.println("Choose a character to test");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        char letter = input.charAt(0);
        int count = charcount.CharCount(array, 0, letter);
        System.out.println("There are " + count + " " + letter + "'s in the array");

        //I think the time complexity of this program is O(n), where n is the length of the array
    }
}