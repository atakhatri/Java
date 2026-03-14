public class constructor_overload {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(1002, "abc def");
        s2.display();
    }
}

class Student {
    int id;
    String name;

    Student() {
        id = 1001;
        name = "ata khatri";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
    }
}
