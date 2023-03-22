package week7;
import java.util.Scanner;


public class ArrayFromInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        String[] roles = new String[3];
        double[] kdas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: ");
            names[i] = scanner.nextLine();
            System.out.println("Role: ");
            roles[i] = scanner.nextLine();
            System.out.println("KDA: ");
            kdas[i] = Double.parseDouble(scanner.nextLine());
            System.out.println();
        }
        /*System.out.println("Name, Role, KDA:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ", " + roles[i] + ", " + kdas[i]);
        } */

        System.out.printf("%-14s %-8s %10s\n", "Name", "Role", "KDA");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-14s  %-6s  %10.2f\n", names[i], roles[i], kdas[i]);


        }
        scanner.close();
    }
}
