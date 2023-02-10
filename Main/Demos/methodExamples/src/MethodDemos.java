import java.util.Scanner;
public class MethodDemos {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        //printName("John");
        //printStudentInfo("John", 19, 3.0);
        System.out.println("Enter a fahrenheit temperature");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        System.out.printf("Celsius: %.1f\n", convertToCelsius(fahrenheit));

        System.out.println("Enter a celsius temperature");
        double celsius = Double.parseDouble(scanner.nextLine());
        System.out.printf("Fahrenheit: %d", convertToFahrenheit(celsius)); */
        int number = 10;
        incrementNumber(number);
        System.out.printf("Number value in main: %d\n", number);

    }
    public static void incrementNumber(int number) {
        number++;
        System.out.printf("Number value in method: %d\n", number);
    }
    public static Double convertToCelsius(int ftemp) {
        double celsius = (ftemp -32) * 5.0/9;
        return celsius;
    }
    public static int convertToFahrenheit(double ctemp) {
        double fahrenheit = 9/5 * ctemp + 32;
        return (int) fahrenheit;
    }



    /*public double calculatePay() {
        total = salary + bonus;
        return total;

    } */
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void printStudentInfo(String name, int age, double gpa) {
        System.out.printf("Name: %s\nAge: %d\nGPA: %.1f\n", name, age, gpa);
    }
}
