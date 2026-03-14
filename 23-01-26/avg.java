public class avg {
    static void average(int x, int y, int z)
    {
        float sum = x + y + z;
        float res = sum / 3;

        System.out.println("average of three num : " + res);
    }

    public static void main(String[] args) {
        average(11, 9, 21);
    }
}
