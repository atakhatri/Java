public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0, digit = 0;
        System.out.println("Number = " + num);

        while (num != 0) {
            digit = num % 10; // extract digit
            sum += digit; // add to sum
            num /= 10; // decrease number
        }

        System.out.println("Sum = " + sum);
    }
}
