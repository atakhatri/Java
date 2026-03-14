public class myOOPs3 {
    int length;
    int width;

    void rectData(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        int area = length * width;
        System.out.println("Area of rectangle = " + area);
    }

    public static void main(String[] args) {
        myOOPs3 m1 = new myOOPs3();
        myOOPs3 m2 = new myOOPs3();
        m1.rectData(10, 20);
        m2.rectData(30, 40);
        m1.area();
        m2.area();
    }
}
