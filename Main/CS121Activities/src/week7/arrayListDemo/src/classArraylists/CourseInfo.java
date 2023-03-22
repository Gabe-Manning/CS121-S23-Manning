package classArraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CourseInfo {

    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        this.names.add(name);
    }
    public void addScore(int score) {
        this.scores.add(score);
    }
    public void addGPA(double gpa) {
        this.gpas.add(gpa);
    }
    public void addGrade(char grade) {
        this.letterGrades.add(grade);
    }

    public void displayCourses() {
        System.out.printf("%-10s%-10s%-10s%s\n", "Course", "GPA", "Score", "Grade");
        for (int i = 0; i<names.size(); i++) {
            System.out.printf("%-10s%-10.2f%-10d%c\n", names.get(i), gpas.get(i), scores.get(i), letterGrades.get(i));
        }
    }
}