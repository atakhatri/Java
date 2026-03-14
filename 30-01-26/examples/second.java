public class second {
    public static void main(String[] args) {
        String s = "3.14f";
        System.out.println("value of string s = " + s);

        Float f1 = Float.valueOf(s);
        System.out.println("value of float f1 = " + f1);

        Integer i = Integer.valueOf("101011", 2);
        System.out.println("value of Integer i (101011) in decimal = "+ i);

        int i1 = Integer.parseInt("12345");
        System.out.println("value of int i1 = " + i1);

        float f = Float.parseFloat(s);
        System.out.println("value of float f = " + f);

        Float f2 = Float.parseFloat(s);
        float fvalue = f2.floatValue();
        System.out.println("xvalue() = " + fvalue);
    }
}
