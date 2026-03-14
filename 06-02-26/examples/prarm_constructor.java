public class prarm_constructor {
    public static void main(String[] args) {
        Dept d1 = new Dept(1001, "CS");
        d1.display();
    }

}

class Dept {
    int deptID;
    String deptName;

    Dept(int id, String name) {
        deptID = id;
        deptName = name;
    }

    void display() {
        System.out.println("Department ID = " + deptID);
        System.out.println("Department Name = " + deptName);
    }
}
