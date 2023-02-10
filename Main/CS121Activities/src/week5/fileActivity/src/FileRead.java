import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("courses.txt");
        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch(FileNotFoundException e) {
            System.err.println("File not found");
        }

    }
}

