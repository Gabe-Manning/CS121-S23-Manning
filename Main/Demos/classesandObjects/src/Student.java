public class Student {
    String name;
    String id;
    String major;
    double gpa;

    public Student(String name, String id, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    void getStudentInfo() {
        System.out.printf("Name: %s\nID: %s\nMajor: %s\nGPA: %.1f\n\n", name, id, major, gpa);
    }
}
