package week7;

public class ArrayDemo3 {
    public static void main(String[] args) {


        String[][] names = {{"John", "Jake", "Josh"}, {"Sean", "Seth", "Sam"}};

        for (String[] row : names) {
            for (String column : row) {
                System.out.println(column);
            }
        }
    }

}
