public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon("Bulbasaur");
        Pokemon pokemon3 = new Pokemon("Charmander", 20, 1.5, 30);

        System.out.printf("Original Attack: %.1f\n", pokemon3.getAttack());
        pokemon3.setAttack(35);
        System.out.printf("Set Attack: %.1f\n", pokemon3.getAttack());
        pokemon3.setAttack(20, 2);
        System.out.printf("Set Attack with modifier: %.1f\n", pokemon3.getAttack());
    }
}
