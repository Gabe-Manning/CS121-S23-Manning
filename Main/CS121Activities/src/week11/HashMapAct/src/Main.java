import java.util.Objects;
public class Main {
    public static void main(String[] args) {

        Champions demo = new Champions();

        demo.addChamp("Garen", "Top");
        demo.addChamp("Veigar", "Mid");
        demo.addChamp("Syndra", "Mid");

        demo.displayChamps();
        System.out.println();

        demo.removeChamp("Syndra");
        demo.displayChamps();
    }
}
