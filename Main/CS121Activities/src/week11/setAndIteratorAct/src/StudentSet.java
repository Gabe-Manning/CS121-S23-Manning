import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class StudentSet {

    static Set<String> students = new HashSet<>();

    public static void addStudents() {
        Scanner console = new Scanner(System.in);

        String input = null;
        do {
            System.out.println("Enter the name of a student or q to quit.");
            input = console.nextLine();
            if (input.equals("q"))
                return;
            students.add(input);

        }
        while (!input.equals("q"));

    }

    public static void displayStudents() {
        Iterator<String> iter = students.iterator();

        while (iter.hasNext()) {
            String student = (String)iter.next();
            System.out.println(student);
        }

    }
}