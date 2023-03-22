package examples.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jane Doe", "12345", "Freshman", "Computer Science", 3.5);

        System.out.printf("Name: %s\n", student1.name);
        //System.out.printf("ID: %s\n", student1.id);
        System.out.printf("Class Standing: %s\n", student1.classStanding);
        System.out.printf("Major: %s\n", student1.major);
        //System.out.printf("GPA: %.2f\n", gpa);
        System.out.println();

        student1.getStudentInfo();
        System.out.println();
        //student1.getStudentID();
        student1.getStudent();
        System.out.println();
        student1.getStudentRecord();
    }
}
