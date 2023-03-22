public class Employee {
    String name;
    String id;
    double salary;
    double bonus;
    double totalPay;

    public Employee(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    void calculateTotalPay() {
        totalPay = salary + bonus;
    }

    void getEmployeeInfo() {
        System.out.printf("Name: %s\nID: %s\nSalary: %.2f\nBonus: %.2f\nTotal Pay: %.2f\n", name, id, salary, bonus, totalPay);
    }
}
