import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter FileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(FileWriter);

            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("%s %s %s", course, credits, score);
            FileWriter.close();
            output.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

    }
}
