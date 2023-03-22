package stringArrayList;

import java.util.ArrayList;

public class StringArrayList {

    public ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public String getName(int index) {
        return names.get(index);
    }

    public int getSizeOfList() {
        return names.size();
    }

    public void display1() {
        System.out.printf("Names: \n");
        for (Object name : names) {
            System.out.printf("%s\n", name);
        }
    }

    public void display2() {
        System.out.printf("Names: \n");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s\n", names.get(i));
        }
    }
}
