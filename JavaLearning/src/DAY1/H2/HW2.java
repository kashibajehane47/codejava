package DAY1.H2;

public class HW2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one name as argument.");
            return;
        }
        String name = args[0];
        System.out.println("Welcome " + name);
    }

}
