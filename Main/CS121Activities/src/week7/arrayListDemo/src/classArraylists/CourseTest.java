package classArraylists;
import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CourseInfo courseInfo = new CourseInfo();
        while (true) {
            System.out.println("Enter Course or q to quit");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            else {
                courseInfo.addName(input);
                System.out.println("GPA: ");
                courseInfo.addGPA(Double.parseDouble(scanner.nextLine()));
                System.out.println("Score: ");
                courseInfo.addScore(Integer.parseInt(scanner.nextLine()));
                System.out.println("Letter Grade: ");
                courseInfo.addGrade(scanner.nextLine().charAt(0));
                scanner.nextLine();
            }
        }
        courseInfo.displayCourses();


    }
}