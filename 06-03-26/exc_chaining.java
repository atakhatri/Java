class InvalidDataException extends Exception {
    public InvalidDataException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

public class exc_chaining {
    public static void process() throws InvalidDataException {
        try {
            String s = null;
            s.length();
        }
        catch(NullPointerException e) {
            throw new InvalidDataException("data processing failed",e);
        }
    }

    public static void main(String[] args) {
        try {
            process();
        }
        catch(InvalidDataException e) {
            e.printStackTrace();
        }
    }
}
