public class multiCatch {
    public static void main(String[] args) {
        try {
            int[] num = {1,2,3};
            System.out.print("number : " + num[0]);
            int res = 10/0;
        }
        catch(ArithmeticException e) {
            System.out.println("cought arithmetic exception : division by zero not possible " );
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("cought array index out of bounds exception : invalid array index accessed");
        }
        catch(Exception e) {
            System.out.println("cought exception : some other exception occurred");
        }

        System.out.println("program continues after handling multiple exceptions.");
    }
}
