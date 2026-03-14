public class emp
{
    enum gender {
        male, female
    }

    public static void main(String args[])
    {
        int eid = 101;
        String name = "ata";

        System.out.println("eid = " + eid);
        System.out.println("ename = " + name);

        gender gender_select = gender.male;
        System.out.println("gender = " + gender_select);
    }
}