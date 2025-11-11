package DAY8.HW3;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 75;
        int[] nums = {14, 23, 78, 95, 75};
        int index = -1;

        long start = System.nanoTime();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }

        long end = System.nanoTime();

        System.out.println("Time Taken: " + (end - start) + " ns");

        if (index != -1) {
            System.out.println("Target is found at index " + index);
        } else {
            System.out.println("Target is not found");
        }
    }
}
