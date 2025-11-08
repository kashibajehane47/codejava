package DAY8.HW1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements for the array:");

        int[] nums = new int[5]; // Array declaration and memory allocation

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nArray elements using normal for loop:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nArray elements using enhanced for loop:");
        for (int temp : nums) {
            System.out.print(temp + " ");
        }

        sc.close();
    }
}
