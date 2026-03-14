public class exp1 {
    public static void main(String args[])
    {
        int mat1[][] = {
            {1,2},
            {3,4}
        };
        int mat2[][] = {
            {10,20},
            {30,40}
        };

        System.out.println("Matrix 1 : ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 : ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum Matrix : ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print((mat1[i][j] + mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
