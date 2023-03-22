package abstractClasses;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon Cleffa = new Friendship("Cleffa", "Fairy", 230);
        System.out.printf("This Pokemon will evolve: %b\n", Cleffa.checkEvolve());

        Pokemon Golbat = new Friendship("Golbat", "Poison-Flying", 100);
        System.out.printf("This Pokemon will evolve: %b\n", Golbat.checkEvolve());

        Pokemon Growlithe = new Item("Growlithe", "Fire", true);
        System.out.printf("This Pokemon will evolve: %b\n", Growlithe.checkEvolve());

        Pokemon Squirtle = new Item("Squirtle", "Water", false);
        System.out.printf("This Pokemon will evolve: %b\n", Squirtle.checkEvolve());
    }
}
