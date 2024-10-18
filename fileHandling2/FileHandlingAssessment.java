package fileHandling2;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandlingAssessment {

    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(new FileReader("../first/SampleText.txt"));
            while (reader.hasNextLine()) { 
                String line = reader.nextLine(); 
                System.out.println(line); 
            }
            reader.close(); 
        } catch (IOException e) {
            System.out.println("Reading the file failed.");
            System.exit(0);
        }
    }
}