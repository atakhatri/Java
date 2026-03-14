public class UncheckedException {
    public static void main(String[] arga) {
        try {
            int res = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("exception cought : " + e.getMessage());
        }
    }
}
