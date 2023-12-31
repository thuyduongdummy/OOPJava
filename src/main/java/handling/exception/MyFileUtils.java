package handling.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileUtils {
    public static void main(String[] args) {
        try {
            File file = new File("myfile.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
