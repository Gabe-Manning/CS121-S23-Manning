import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student student = new Student("Billy Jones", 13524, "Freshman");
            Gson gson = new Gson();
            String jsonString = gson.toJson(student);

            FileWriter writer = new FileWriter("students.json");
            writer.write(jsonString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
