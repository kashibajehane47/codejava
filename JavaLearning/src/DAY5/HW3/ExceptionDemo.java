package DAY5.HW3;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] num = {10, 20, 30, 40, 50};
        String s = "apple";

        try {

            int nums = Integer.parseInt(s);
            System.out.println(nums);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Happened: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound Exception: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Scanner closed in finally block.");
        }

        System.out.println("Last line of the program");
    }
}
