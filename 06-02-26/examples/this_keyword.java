public class this_keyword {

    public static void main(String[] args) {
        Student s1 = new Student(1001, "ata khatri", 5000);
        s1.display();
    }
}

class Student {
    int rollNo;
    String name;
    double fee;

    Student(int rollNo, String name, double fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Fee = " + fee);
    }
}
