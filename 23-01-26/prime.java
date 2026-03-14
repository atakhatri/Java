public class prime {
    static boolean isPrime(int num)
    {
        boolean primeOrNot = true;
        if (num <= 1) {
            primeOrNot = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primeOrNot = false;
                    break;
                }
            }
        }
        return primeOrNot;
    }

    public static void main(String[] args) {
        int num = 10;
        boolean primeOrNot = isPrime(num);

        if (primeOrNot) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
