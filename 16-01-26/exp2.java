public class exp2 {
    public static void main(String args[])
    {
        int mat1[][] = {
            {3,4},
            {2,1}
        };
        int mat2[][] = {
            {1,5},
            {3,7}
        };

        int result[][] = new int[2][2];

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

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                int sum = 0;
                for (int k = 0; k < 2; k++)
                {
                    sum += mat1[i][k] * mat2[k][j];
                }
                result[i][j] = sum;
            }
        }

        System.out.println("Result Matrix : ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
