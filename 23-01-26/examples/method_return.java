package examples;
public class method_return {
    public static int even_odd(int n)
    {
        int flag;
        if (n % 2 == 0)
        {
            flag = 0;
        } else {
            flag = 1;
        }

        return flag;
    }

    public static void main(String[] args) {
        int res = even_odd(10);

        if (res == 0)
        {
            System.out.println("given num is even.");
        } else {
            System.out.println("given num is odd");
        }
    }
}
