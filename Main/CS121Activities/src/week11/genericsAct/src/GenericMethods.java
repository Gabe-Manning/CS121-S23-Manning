//import java.util.ArrayList;

public class GenericMethods {

    public <E> void printArrayList(E[] inputArrayList) {
        for (E element : inputArrayList) {
            System.out.printf("%s ", element);
        }
        System.out.println();

    }
}
