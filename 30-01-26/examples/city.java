public class city {
    enum City {
        baroda, ahemdabad, surat
    }

    public static void main(String args[])
    {
        City c1 = City.baroda;
        City c2 = City.surat;

        System.out.println("First City = " + c1);
        System.out.println("Second City = " + c2);
    }
}
