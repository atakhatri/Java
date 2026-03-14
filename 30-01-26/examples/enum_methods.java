public class enum_methods {
    public enum Direction {
        north, south, east, west
    }

    public static void main(String args[])
    {
        for (Direction dir : Direction.values())
            {
                System.out.println(dir);
            }

        Direction dir_value = Direction.valueOf("east");
        System.out.println("Direction = " + dir_value);

        System.out.println("Ordinal of east = " + dir_value.ordinal());
    }
}
