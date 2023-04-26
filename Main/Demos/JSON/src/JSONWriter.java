import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Jane Smith", 5678, "Accounting");

            Gson gson = new Gson();

            String jsonString = gson.toJson(employee);

            FileWriter fileWriter = new FileWriter("employee.json");
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
