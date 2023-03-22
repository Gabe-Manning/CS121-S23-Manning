import java.util.Scanner;
public class ArrayDemo {
 /*
    int[] scores;
    char[] letterGrade;
    double[] gpas;
    String[] names;

    int[] scores = new int[3];
    char[] letterGrade = new char[4];
    double[] gpas = new double[4];
    String names = new String[10]; */

    public static void main(String[] args) {
        /*String[] names = new String[5];
        names[0] = "Mary";
        names[1] = "Tom";
        names[2] = "John";
        names[3] = "Jane";
        names[4] = "Lisa"; */


        /*int[] scores = new int[5];
        scores[0] = 88;
        scores[1] = 100;
        scores[2] = 95;
        scores[3] = 100;
        scores[4] = 85;

        System.out.printf("There are %d names in the names array\n", names.length);
        System.out.println("The name at index 0 is " + names[0]);
        System.out.printf("The name at index 1 is %s\n", names[1]);
        System.out.printf("The name at index 2 is %s\n", names[2]);
        System.out.printf("The name at index 3 is %s\n", names[3]);
        System.out.printf("The name at index 4 is %s\n", names[4]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("What the loop is doing:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Loop %d: i is %d and gets the name at index %d: %s\n", i + 1, i, i, names[i]);
        } */

    /*String[] firstNames = {"Mary", "Tom", "John", "Jane", "Lisa"};
    String[] lastNames = {"Johnson", "Jones", "Doe", "Smith", "Allen"};
    int[] ages = { 19, 21, 20, 19, 18};

        System.out.printf("%-14s %s\n", "Name", "Age");

        for (int i = 0; i < firstNames.length; i++) {
            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
        } */


        Scanner console = new Scanner(System.in);

        String[] firstNames = new String[5];
        String[] lastNames = new String[5];
        int[] ages = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("First name: ");
            firstNames[i] = console.nextLine();
            System.out.println("Last name: ");
            lastNames[i] = console.nextLine();
            System.out.println("Age: ");
            ages[i] = Integer.parseInt(console.nextLine());
            System.out.println();

        }
        System.out.printf("%-20s %s\n", "Name", "Age");

        for (int i = 0; i < firstNames.length; i++) {
            System.out.printf("%-20s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
        }
console.close();
    }

}
