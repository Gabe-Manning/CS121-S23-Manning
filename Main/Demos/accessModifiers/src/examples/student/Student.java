package examples.student;

public class Student {

    //variables
    public String name;
    private String id;
    public String classStanding;
    public String major;
    private double gpa;

    public Student(String name, String id, String classStanding, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.classStanding = classStanding;
        this.major = major;
        this.gpa = gpa;
    }

    public void getStudentInfo() {
        System.out.printf("Name: %s\nClass Standing: %s\nMajor: %s\n", name, classStanding, major);
    }

    private void getStudentID() {
        System.out.printf("Name: %s\nID: %s\n", name, id);
    }

    protected void getStudentRecord() {
        System.out.printf("Name: %s\nID: %s\nClass Standing: %s\nMajor: %s\nGPA: %.2f\n", name, id, classStanding, major, gpa);

    }

    void getStudent() {
        System.out.printf("Name: %s\n", name);
    }
}
