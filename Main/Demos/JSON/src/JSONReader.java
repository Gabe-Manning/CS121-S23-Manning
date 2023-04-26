import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader {
    public static void main(String[] args) {
         try {
             Gson gson = new Gson();

             BufferedReader reader = new BufferedReader(new FileReader("employee.json"));

             Employee employee = gson.fromJson(reader, Employee.class);

             System.out.println("****Employee Details****");
             System.out.printf("Employee name: %s\nEmployee id: %d\nEmployee department: %s", employee.getName(), employee.getId(), employee.getDepartment());

         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
