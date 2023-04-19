import java.util.LinkedList;
public class Student {
    public String firstname;
    public String lastname;
    public int id;
    public String major;
    public String classstanding;
    public double gpa;
    LinkedList<String> courseList = new LinkedList<>();

    public Student(String firstname, String lastname, int id, String major, String classstanding) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.major = major;
        this.classstanding = classstanding;
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public String getStudentInfo() {
        String s= "First Name: " + firstname + "\nLast Name: " + lastname + "\nStudent ID: " + id + "\nMajor: " + major + "\nClass Standing: " + classstanding;
        return s;
    }

    public void displayCourse() {
        System.out.printf("Course List: %s\n", courseList);
    }

}
