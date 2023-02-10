import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile1 = new File("course.txt");
        try {
            Scanner input = new Scanner(inputFile1);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch(FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("File not found");
        }

    }
}
