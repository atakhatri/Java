public class operations {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 20;
        int b = 0;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}

class ops {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        } else {
            return x / y;
        }
    }
}

class Calculator extends ops {

}