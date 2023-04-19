import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amy", "Joe", "Lisa"));
        ListIterator<String> iter = names.listIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();
        while(iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }
}
