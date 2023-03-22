public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "12345", 75600.00, 20000);
        Employee employee2 = new Employee("Jane Doe", "22345", 84370.00, 25000);

        employee1.calculateTotalPay();;
        employee1.getEmployeeInfo();
        System.out.println();

        employee2.calculateTotalPay();
        employee2.getEmployeeInfo();
    }
}
