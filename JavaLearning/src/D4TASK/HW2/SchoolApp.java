package D4TASK.HW2;

class Person {
    String name;
    String dateOfBirth;

    void setPersonDetails(String name, String dob) {
        this.name = name;
        this.dateOfBirth = dob;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Teacher extends Person {
    double salary;
    String subject;

    void setTeacherDetails(String name, String dob, double salary, String subject) {
        setPersonDetails(name, dob);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacher() {
        displayPerson();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("........................");
    }
}

class Student extends Person {
    String studentId;

    void setStudentDetails(String name, String dob, String studentId) {
        setPersonDetails(name, dob);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("D4TASK.HW2.Student ID: " + studentId);
        System.out.println("......................");
    }
}

class CollegeStudent extends Student {
    String collegeName;
    String year;

    void setCollegeStudentDetails(String name, String dob, String studentId, String collegeName, String year) {
        setStudentDetails(name, dob, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    void displayCollegeStudent() {
        displayStudent();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
        System.out.println("....................");
    }
}

public class SchoolApp {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setTeacherDetails("Kashi", "04-04-2005", 45000, "chemistry");

        Student s = new Student();
        s.setStudentDetails("Karthik", "12-08-2005", "STU101");

        CollegeStudent cs = new CollegeStudent();
        cs.setCollegeStudentDetails("Priya", "10-11-2004", "CST202", " MSAJCE College of engineering", "third");

        System.out.println("----- D4TASK.HW2.Teacher Details -----");
        t.displayTeacher();

        System.out.println("----- D4TASK.HW2.Student Details -----");
        s.displayStudent();

        System.out.println("----- College D4TASK.HW2.Student Details -----");
        cs.displayCollegeStudent();
    }
}

