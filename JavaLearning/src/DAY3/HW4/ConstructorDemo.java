package DAY3.HW4;

class Students {
    String name;
    int rno;
    String dept;
    static String college;


    public Students(String name, int rno, String dept, String college) {
        this.name = name;
        this.rno = rno;
        this.dept = dept;
        Students.college = college; // Static variable belongs to class
    }


    public Students() {
    }

    public void display() {
        System.out.println("Name: " + name
                + "\nRno: " + rno
                + "\nDept: " + dept
                + "\nCollege Name: " + college);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Students.college = "MSAJ";


        Students s1 = new Students("Jehane", 101, "EEE", "MSAJ");
        s1.display();

        System.out.println("----------------------");


        Students s2 = new Students();
        s2.name = "jen";
        s2.rno = 102;
        s2.dept = "CSE";
        s2.display();
    }
}
