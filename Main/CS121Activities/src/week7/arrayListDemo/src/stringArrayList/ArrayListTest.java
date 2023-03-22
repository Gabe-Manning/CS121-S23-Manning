package stringArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        StringArrayList names = new StringArrayList();

        names.addName("Josh");
        names.addName("Micah");

        System.out.printf("Names contains %d elements.\n", names.getSizeOfList());
        names.display1();

        System.out.printf("\nRemove first element: %s\n", names.getName(0));
        names.removeName("Josh");
        System.out.printf("\nNames contains %d elements.\n", names.getSizeOfList());
        names.display2();


    }
}
