package examples;
public class multi_dem {
    public static void main(String args[])
    {
        int [][] mat_3D = {
            {10,20,30},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Matrix Elements = ");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(mat_3D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
