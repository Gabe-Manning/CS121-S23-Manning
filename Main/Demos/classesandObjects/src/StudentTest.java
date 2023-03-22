public class StudentTest {
    public static void main(String[] arges) {
        Student student1 = new Student("John Doe", "12345", "Computer Science", 3.5);
        Student student2 = new Student("Jane Doe", "22345", "Accounting", 3.9);

        System.out.printf("Name: %s\n", student1.name);
        System.out.printf("ID: %s\n", student1.id);
        System.out.printf("Major: %s\n", student1.major);
        System.out.printf("GPA: %s\n", student1.gpa);
        System.out.println();

        student1.getStudentInfo();
        student2.getStudentInfo();
    }
}
