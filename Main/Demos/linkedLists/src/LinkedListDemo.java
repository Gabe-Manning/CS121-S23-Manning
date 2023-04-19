import java.util.LinkedList;
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        names.addFirst("John");
        names.addLast("Rhonda");

        System.out.printf("Names List: %s\n", names);

        Object firstElement = names.getFirst();
        Object lastElement = names.getLast();
        Object firstItem = names.get(0);
        Object lastItem = names.get(4);
        System.out.printf("First element is %s and last element is %s\n", firstElement, lastElement);
        System.out.printf("First item is %s and last item is %s\n", firstItem, lastItem);

        names.set(0, "Tom");
        System.out.printf("Names List: %s\n", names);
        names.add(0, "Clark");
        System.out.printf("Names List: %s\n", names);

        names.remove(0);
        System.out.printf("Names List: %s\n", names);
        names.removeFirst();
        System.out.printf("Names List: %s\n", names);
        names.removeLast();
        System.out.printf("Names List: %s\n", names);


    }
}
