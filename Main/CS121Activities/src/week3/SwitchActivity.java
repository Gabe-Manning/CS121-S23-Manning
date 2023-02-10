package week3;
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        String colors = null;
        String animal = null;
        String values = null;

        System.out.println("Enter a Hogwarts House");
        String house = console.next();

        switch (house) {
            case "Slytherin":
                colors = "Green and Silver";
                animal = "Snake";
                values = "Ambition, Cunning, and Resourcefulness";
                break;
            case "Ravenclaw":
                colors = "Blue and Bronze";
                animal = "Eagle";
                values = "Intelligence, Curiosity, and Creativity";
                break;
            case "Hufflepuff":
                colors = "Yellow and Black";
                animal = "Badger";
                values = "Dedication, Loyalty, and Fairness";
                break;
            case "Gryffindor":
                colors = "Scarlet and Gold";
                animal = "Lion";
                values = "Bravery, Nerve, and Chivalry";
                break;

        }
        System.out.println("House Colors: " + colors + "\nHouse Animal: " + animal + "\nHouse Values: " + values);
        console.close();
} }
