package examples;
import java.util.Scanner;

public class table {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = obj.nextInt();

        System.out.println("multiplication table of " + n + " : ");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        obj.close();
    }
}
