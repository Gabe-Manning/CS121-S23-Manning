import java.util.Scanner;
public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);

        scanner.close();
    }
    public static Double getLength() {
        System.out.println("What is the length of the rectangle?");
        double length = Double.parseDouble(scanner.next());
        return length;
    }
    public static Double getWidth() {
        System.out.println("What is the width of the rectangle?");
        double width = Double.parseDouble(scanner.next());
        return width;
    }
    public static Double getArea(double length, double width) {
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area) {
        System.out.printf("Length: %.2f\nWidth: %.2f\nArea: %.2f", length, width, area);
    }
}
