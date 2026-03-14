public class piramids {
    public static void main(String[] args) {
        int rows = 5, i, j;
        for (i = 0; i < rows; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (i = rows; i >= 0; i--) {
            for (j = 0; j < rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (i = rows; i >= 0; i--) {
            for (j = rows; j > i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
