package javapractice;
import java.util.Arrays;

public class PairSum {
    public static void findPairs(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println(nums[left] + " " + nums[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        findPairs(nums, target);
    }
}
