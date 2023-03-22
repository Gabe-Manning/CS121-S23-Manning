package interfaces;

public class EnglishStudent implements Grade {

    private String name;
    private double assignmentave;
    private double projectave;

    public EnglishStudent(String name, double assignmentave, double projectave) {
        this.name = name;
        this.assignmentave = assignmentave;
        this.projectave = projectave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAssignmentave() {
        return assignmentave;
    }

    public void setAssignmentave(double assignmentave) {
        this.assignmentave = assignmentave;
    }

    public double getProjectave() {
        return projectave;
    }

    public void setProjectave(double projectave) {
        this.projectave = projectave;
    }

    public double calculateGrade() {
        return ((assignmentave * 0.5) + (projectave * 0.5));
    }
}
