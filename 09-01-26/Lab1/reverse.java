public class reverse {
    public static void main(String[] args) {
        int number = 12345;
        int rev = 0, digit = 0;
        System.out.println("Original = " + number);

        while (number != 0) {
            digit = number % 10; // extract digit
            rev = rev * 10 + digit; // add to reverse
            number /= 10; // decrease number
        }

        System.out.println("Reversed = " + rev);
    }
}
