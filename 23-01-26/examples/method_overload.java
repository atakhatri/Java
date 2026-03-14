package examples;
public class method_overload {
    static int add(int a, int b)
    {
        return a+b;
    }

    static double add(double x, double y)
    {
        return x + y;
    }

    public static void main(String[] args) {
        int a = add(11, 9);
        double d = add(22.5, 7.5);

        System.out.println("Integer addition = " + a);
        System.out.println("Double addition = " + d);
    }
}
