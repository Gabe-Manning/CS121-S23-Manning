import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        int[] intArray = {38, 29, 29, 45, 60, 21, 4, 4, 15};

        for (int num: intArray) {
            set.add(num);
        }

        System.out.print("Array: ");
        for (int elem : intArray) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.print("Set: ");
        for (int elem : set) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Size: " + set.size());

        set.remove(38);

        System.out.println("New size: " + set.size());

        set.add(38);

        System.out.println("38 is in set: " + set.contains(38));

        TreeSet<Integer> sortedSet = new TreeSet<>(set);

        System.out.print("Sorted Set: ");
        for (int elem : sortedSet) {
            System.out.printf(elem + " ");
        }
        System.out.println();

        System.out.println("First element in Sorted set is: " + sortedSet.first());
        System.out.println("Last element in Sorted set is: " + sortedSet.last());

        System.out.println("Set is empty: " + sortedSet.isEmpty());
        sortedSet.clear();
        System.out.println("Set is empty: " + sortedSet.isEmpty());
        System.out.println("Size: " + sortedSet.size());
    }
}
