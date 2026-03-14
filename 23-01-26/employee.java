public class employee {
    static void emp_info(String name, int id, String dept)
    {
        System.out.println("name of Employee : " + name);
        System.out.println("ID of Employee : " + id);
        System.out.println("dept of Employee : " + dept);
    }

    public static void main(String[] args) {
        
        String name = "ata";
        int id = 1011;
        String dept = "marketing";

        emp_info(name, id, dept);
    }
}
