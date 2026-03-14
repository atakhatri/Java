public class first {
    public static void main(String[] args) {
        int a = 50;
        double b = 5.05;

        Integer obj = new Integer(500);

        Integer a1 = Integer.valueOf(a);
        Double b1 = Double.valueOf(b);

        System.out.println(a1.TYPE);
        System.out.println(b1.TYPE);

        if (a1 instanceof Integer)
        {
            System.out.println("an object of integer is created.");
        }
        if (b1 instanceof Double) 
        {
            System.out.println("an object of double is created.");
        }
    }
}
