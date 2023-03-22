package examples;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(12345, "John Doe");
        SalariedEmployee employee2 = new SalariedEmployee(123456, "Matt Smith", 60000);
        HourlyEmployee employee3 = new HourlyEmployee(1234567, "Max Braxton", 20.56, 50);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
