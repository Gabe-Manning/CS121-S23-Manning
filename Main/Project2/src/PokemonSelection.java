//Gabe Manning
//3/21/23
import java.util.Scanner;
public class PokemonSelection {
    //Creates Pokemon
    private static Pokemon createPokemon() {
        Scanner console = new Scanner(System.in);

        //Pokemon stat input from user
        System.out.println("Enter the name of the Pokemon");
        String name = console.nextLine();
        System.out.println("Enter the Pokemon's Hit Points");
        int hp = Integer.parseInt(console.nextLine());
        System.out.println("Enter the name of the move it will use");
        String move = console.nextLine();
        System.out.println("Enter the move's power");
        int power = Integer.parseInt(console.nextLine());
        System.out.println("Enter the Pokemon's attack speed");
        int speed = Integer.parseInt(console.nextLine());

        //Constructs and returns the new Pokemon
        Pokemon pokemon = new Pokemon(name, hp, move, power, speed);
        return pokemon;
    }

    //Assigns each Pokemon to its player
    public static void assignPokemon() {
        //Necessary variables
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
        String stats1;
        String stats2;
        //Each player creates their Pokemon and gets its values assigned to a variable
        for (int i = 1; i < 3; i++) {
            System.out.println("Player " + i + ": Select a Pokemon and enter its stats");
            if (i == 1)
                pokemon1 = createPokemon();
            if (i == 2)
                pokemon2 = createPokemon();
            System.out.println();
            }
        //Displays the stats of each player's Pokemon
        for (int j = 1; j < 3; j++) {
            System.out.println("Player " + j + " Pokemon");
            System.out.println("----------------");
            if (j == 1) {
                stats1 = pokemon1.displayPokemonStats();
                System.out.println(stats1);
            }
            if (j == 2) {
                stats2 = pokemon2.displayPokemonStats();
                System.out.println(stats2);
            }
        }

    }
}