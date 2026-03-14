public class s_case {
    public static void main(String[] args) {
        System.out.println();

        int x = 1, y = 2, z;

        char c = 's';

        switch (c) {
            case 'a':
                z = x + y;
                System.out.println("addition = " + z);
                break;

            case 'd':
                z = x / y;
                System.out.println("division = " + z);
                break;

            case 'm':
                z = x * y;
                System.out.println("multiplication = " + z);
                break;
            case 's':
                z = y - x;
                System.out.println("subtraction = " + z);
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
