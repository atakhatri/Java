import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        }
        catch(FileNotFoundException e) {
            System.out.println("cought exception : " + e);
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        System.out.println("file read successfully !!");
    }
}