import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");

        Iterator<String> iter= names.iterator();

        //while(iter.hasNext()) {
          //  String name = iter.next();
            //System.out.println(name);

        /*while(iter.hasNext()) {
            String name = (String)iter.next();
            if (name.equals("Alice")) {
                iter.remove();
            }
        }

        while(iter.hasNext()) {
            String name = (String)iter.next();
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        } */

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Amy", "Joe", "Lisa"));
        Iterator<String> i = namesList.iterator();
        i.next();
        i.forEachRemaining(System.out::println);
    }
}
