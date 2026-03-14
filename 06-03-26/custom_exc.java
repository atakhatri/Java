class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }    
}

public class custom_exc {
    public static void main(String[] args) {
        try {
            validateAge(12);
        }
        catch(InvalidAgeException e) {
            System.out.println("cought custom exception : " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("age must be 18 or more");
        }
        System.out.print("age is valid");
    }
}
