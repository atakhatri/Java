public class DayOfWeek {
    enum Days {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday
    }

    public static void main(String[] args) {
        for (Days d : Days.values()) {
            System.out.println(d);
        }
    }
}
