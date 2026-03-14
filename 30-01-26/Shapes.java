public class Shapes {
    enum shape {
        squere, round, ractange, triangle, haxagon, octagon
    }

    public static void main(String[] args) {
        shape shName = shape.valueOf("squere");
        System.out.println("Shape = " + shName);
        System.out.println("index of shape = " + shName.ordinal());
    }
}
