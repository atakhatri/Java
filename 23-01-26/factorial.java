public class factorial {
    static void fact(int n)
    {
        int fct = 1;

        for (int i = 1; i <= n; i++) {
            fct *= i;
        }

        System.out.println(n + "! = " + fct);
    }

    public static void main(String[] args) {
        fact(5);
    }
}
