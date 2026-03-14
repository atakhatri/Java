public class c_constructor {
    String name;

    public c_constructor() {
        name = "ata khatri";
    }

    public static void main(String[] args) {
        c_constructor c1 = new c_constructor();
        System.out.println("Name = " + c1.name);
    }
}
