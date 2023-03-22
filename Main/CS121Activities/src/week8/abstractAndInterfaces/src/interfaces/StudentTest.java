package interfaces;

public class StudentTest {
    public static void main(String[] args) {

        CalculusStudent Mike = new CalculusStudent("Mike", 90, 70);
        System.out.printf("Grade: %.2f\n", Mike.calculateGrade());

        EnglishStudent Lisa = new EnglishStudent("Lisa", 95, 80);
        System.out.printf("Grade: %.2f\n", Lisa.calculateGrade());
    }
}
