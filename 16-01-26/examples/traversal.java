package examples;
public class traversal {
    public static void main(String args[])
    {
        int matrix[][] = {
            {11,22,33},
            {44,55,66}
        };

        System.out.println("Traversal of Matrix (changed dimensions) : ");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
