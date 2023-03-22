package examples;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayLists demo = new ArrayLists();

        demo.addScore(98);
        demo.addScore(87);
        demo.addScore(91);

        System.out.printf("Scores contains %d elements.\n", demo.getSizeOfScoreList());
        demo.displayScores1();

        System.out.printf("\nRemove first element: %d\n", demo.getScore(0));
        demo.removeScore(0);
        System.out.printf("\nScores contains %d elements.\n", demo.getSizeOfScoreList());
        demo.displayScores2();
    }
}
