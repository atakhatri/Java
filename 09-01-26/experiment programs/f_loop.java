public class f_loop {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("For Loop in Java:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("value of i : " + i);
        }
        System.out.println("");

        System.out.println("While Loop in Java:");
        int j = 1;
        while (j <= 10) {
            System.out.println("value of j : " + j);
            j++;
        }
        System.out.println("");

        System.out.println("Do-While Loop in Java:");
        int k = 1;
        do {
            System.out.println("value of k : " + k);
            k++;
        } while (k <= 10);
    }
}
