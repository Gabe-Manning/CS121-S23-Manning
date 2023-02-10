import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mynewcourses.txt");
        PrintWriter output = new PrintWriter(outputFile);

        String course;
        String credits;
        String score;

        output.printf("course credits score \n");

        for (int i = 1; i <= 3; i++) {
            course = JOptionPane.showInputDialog(String.format("Enter name of course:"));
            credits = JOptionPane.showInputDialog(String.format("Enter the course credits"));
            score = JOptionPane.showInputDialog(String.format("Enter the course score"));
            output.printf(course + " " + credits + " " + score + "\n");
        }
        output.close();

    }
}