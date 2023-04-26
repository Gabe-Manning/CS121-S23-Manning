import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            Student student = gson.fromJson(reader, Student.class);

            System.out.println("Student Data");
            System.out.printf("Name: %s\nID: %d\nYear: %s\n", student.getName(), student.getId(), student.getYear());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
