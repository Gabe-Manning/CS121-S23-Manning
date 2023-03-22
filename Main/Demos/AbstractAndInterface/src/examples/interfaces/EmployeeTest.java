package examples.interfaces;

public class EmployeeTest {
    public static void main(String[] args) {

        HourlyEmployee employee1 = new HourlyEmployee(12345, "John Doe", 30.00, 40);
        System.out.printf("Weekly Salary: %.2f\n", employee1.calculatePay());
    }
}
