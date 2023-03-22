package inheritance;

public class Test {
    public static void main(String[] args) {

        Animal cardinal = new Animal("Cardinal", "Red", 20000);
        Animal tiger = new Mammal("Tiger", "Orange, Black, and White", 200, true);
        Animal lizard = new Reptile("Lizard", "Green", 100000, true);

        System.out.println(cardinal);
        System.out.println(tiger);
        System.out.println(lizard);
    }
}
