import java.util.Scanner;
public class RentalFeeTest {
    public static void main(String[] args) {
        RentalFee rentalFee = new RentalFee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rate per day:");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the pickup date as mm/dd/yyyy:");
        String pickup = scanner.nextLine();
        System.out.println("Enter the return date as mm/dd/yyyy:");
        String returnDate = scanner.nextLine();

        double fee = rentalFee.calcRentalFee(rate, pickup, returnDate);
        System.out.printf("Rental fee = $%.2f", fee);
    }
}
