public class employee {

    public static void main(String[] args) {

        emp e1 = new emp(29641, "xyz", 575000, "sales");
        e1.display();
    }
}

class emp {
    int empID;
    String empName;
    double empSalary;
    String empDept;

    emp(int id, String name, double salary, String dept) {
        empID = id;
        empName = name;
        empSalary = salary;
        empDept = dept;
    }

    void display() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Department: " + empDept);
    }
}
