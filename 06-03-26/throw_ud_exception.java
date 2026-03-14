class UDException extends Exception {
    public UDException(String str) {
        super(str);
    }
}

public class throw_ud_exception {
    public static void main(String[] args) {
        try {
            throw new UDException("this is user defined exception !");
        }
        catch (UDException ude) {
            System.out.println("cought the exception ");
            System.out.println(ude.getMessage());
        }
    }
}
