package D4TASK.HW1;

class Employee{
    double calculateBonus(double salary){
        return (salary*0.1);
    }
}

class Manager extends Employee{
    double calculateBonus(double salary){
        return (salary*0.3);
    }
}
class Intern extends Employee{
    double calculateBonus(double salary){
        return (salary*0.2);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager=new Manager();
        System.out.println(manager.calculateBonus(95000));
        Employee intern=new Intern();
        double bonus=intern.calculateBonus(25000);
        System.out.println(bonus);
    }
}