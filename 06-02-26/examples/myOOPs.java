public class myOOPs {

    int x = 10;

    public static void main(String[] args) {
        int y = 20;
        System.out.println("y = " + y);

        myOOPs m1 = new myOOPs();
        System.out.println("x as object m1 = " + m1.x);

        myOOPs m2 = new myOOPs();
        m2.x = 30;
        System.out.println("x as object m2 = " + m2.x);
    }
}