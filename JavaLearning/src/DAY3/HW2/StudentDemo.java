package DAY3.HW2;

class Student {
    String name;
    int rno;
    String dept;
    static String college;  // Static variable (shared)

    public void display() {
        System.out.println("Name: " + name
                + "\nRno: " + rno
                + "\nDept: " + dept
                + "\nCollege Name: " + college);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Object 1
        Student s1 = new Student();
        s1.name = "Jehane";
        s1.rno = 101;
        s1.dept = "EEE";
        Student.college = "MSAJCE";
        s1.display();

        System.out.println("----------------------");

        Student s2 = new Student();
        s2.name = "Akhil";
        s2.rno = 102;
        s2.dept = "CSE";
        s2.display();
    }
}

