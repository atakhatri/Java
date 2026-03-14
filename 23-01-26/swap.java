public class swap {
    static void swapper(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After : a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        System.out.println("Before : a = " + a + ", b = " + b);

        swapper(a, b);
    }
}
