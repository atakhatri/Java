public class evnOdd_flag {
    public static void main(String[] args) {
        int num = 11;
        boolean isEven = false; // flag
        if (num % 2 == 0) {
            isEven = true; // set to true
        } // other wise false

        if (isEven) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
