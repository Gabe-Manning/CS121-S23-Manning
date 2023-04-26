
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class JSONArrayReader {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void readJson() {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("employees.json"));

            Type employeeListType = new TypeToken<ArrayList<Employee>>(){}.getType();

            employeeList = gson.fromJson(reader, employeeListType);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getInfo());
        }
    }
}
