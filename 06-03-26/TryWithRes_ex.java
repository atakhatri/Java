import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRes_ex {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
