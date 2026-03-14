public class bigger_num {

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;
        int num3 = 10;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is bigger !!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is bigger !!");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is bigger !!");
        } else {
            System.out.println("All numbers are equal.");
        }
    }
}
