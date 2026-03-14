public class error_ex {
    public static void main(String[] args) {
        try {
            causesStackOverflowError();
        }
        catch(StackOverflowError e) {
            System.out.println("cought error : " + e.getMessage());
        }
    }

    public static void causesStackOverflowError() {
        causesStackOverflowError();
    }
}
