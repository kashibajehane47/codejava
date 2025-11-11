package DAY8.HW5;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];

            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = temp;
            System.out.println("After rotation " + (i + 1) + ": " + Arrays.toString(nums));
        }

        System.out.println("Final rotated array: " + Arrays.toString(nums));
    }
}
