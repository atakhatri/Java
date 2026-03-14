package examples;
public class oneD_array {
    public static void main(String args[])
    {
        int roll[] = new int[5];

        roll[0] = 11;
        roll[1] = 12;
        roll[2] = 13;
        roll[3] = 14;
        roll[4] = 15;
        
        for (int i = 0; i <= 4; i++)
        {
            System.out.print(" roll no. = " + roll[i]);
            System.out.print("\n");
        }
    }
}
