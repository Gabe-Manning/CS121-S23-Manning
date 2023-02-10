import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SalesReport {
    public static void main(String[] args) throws FileNotFoundException{
        final int NUMDAYS = 30;
        String filename;
        double totalSales;
        double aveSales;

        filename = getFileName();
        totalSales = getTotalSales(filename);
        aveSales = totalSales / NUMDAYS;
        displayResults(totalSales, aveSales);
        System.exit(0);

    }
    public static String getFileName() {
        String file;
        file = JOptionPane.showInputDialog("Enter the name of the file containing 30 days of sales");
        return file;
    }
    public static double getTotalSales(String filename) throws FileNotFoundException {
        double total = 0.0;
        double sales;

        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            sales = Double.parseDouble(scanner.nextLine());
            total += sales;
        }
        scanner.close();
        return total;

    }
    public static void displayResults(double total, double average) {
        JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $%.2f\n" +
                "The average daily sales were $%,.2f", total, average));
    }
}
