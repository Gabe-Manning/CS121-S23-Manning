package interfaces;

public class CalculusStudent implements Grade {

    private String name;
    private double assignmentave;
    private double testave;

    public CalculusStudent(String name, double assignmentave, double testave) {
        this.name = name;
        this.assignmentave = assignmentave;
        this.testave = testave;
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

    public double getTestave() {
        return testave;
    }

    public void setTestave(double testave) {
        this.testave = testave;
    }

    public double calculateGrade() {
        return ((assignmentave * 0.3) + (testave * 0.7));
    }
}
