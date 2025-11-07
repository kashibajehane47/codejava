package DAY7.HW1;

interface Operation{
    int execute(int a,int b);
}

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // Lambda for Addition
        Operation add = (a, b) -> a + b;
        System.out.println("Addition: " + add.execute(10, 20));

        // Lambda for Subtraction
        Operation sub = (a, b) -> a - b;
        System.out.println("Subtraction: " + sub.execute(45, 12));

        // Lambda for Multiplication
        Operation mul = (a, b) -> a * b;
        System.out.println("Multiplication: " + mul.execute(12, 5));
    }
}
