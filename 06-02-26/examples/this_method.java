public class this_method {

    public static void main(String[] args) {
        data d1 = new data();
        d1.m2();
    }
}

class data {
    void m1() {
        System.out.println("calling m1");
    }

    void m2() {
        System.out.println("calling m2");
        this.m1();
    }
}