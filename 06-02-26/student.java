public class student {
    public static void main(String[] args) {
        std s1 = new std("abc", 101);
        std s2 = new std();
        s1.display();
        s2.display();
    }
}

class std {
    String sName;
    int sRoll;

    std() {
        sName = "by default";
        sRoll = 0000;
    }

    std(String name, int roll) {
        sName = name;
        sRoll = roll;
    }

    void display() {
        System.out.println("Student ID: " + sRoll);
        System.out.println("Student Name: " + sName);
    }
}