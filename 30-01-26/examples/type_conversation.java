public class type_conversation {
    public static void main(String[] args) {
        String a = new String("100");
        String b = new String("200");

        System.out.println(a + b);

        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Sum of given number is : " + sum);
    }
}
