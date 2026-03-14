public class palindrome {
    public static void main(String[] args) {
        String str = "ATA";
        String str_copy = str;
        String[] arr = str.split("");
        String rev = "";
        int len = str.length();

        for (int i = 1; i <= len; i++) {
            rev += arr[len - i];
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);

        if (str_copy.equals(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
