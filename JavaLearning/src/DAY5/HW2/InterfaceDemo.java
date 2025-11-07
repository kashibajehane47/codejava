package DAY5.HW2;

interface Payable {
    void generatePayslip();
}

class Contractor implements Payable {
    public void generatePayslip() {
        System.out.println("Contractor pay is on day basis");
    }
}

class FullTimeEmployee implements Payable {
    public void generatePayslip() {
        System.out.println("Full Time Employee salary will be on month basis");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payable contractor = new Contractor();
        Payable employee = new FullTimeEmployee();

        contractor.generatePayslip();
        employee.generatePayslip();
    }
}
