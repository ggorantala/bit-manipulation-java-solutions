package operators.xor;

import java.util.HashSet;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(
            "Missing element in the array is " + missingNumber(nums)); // hashtable approach
        System.out.println(
            "Missing element in the array is " + missingNumber(nums)); // math approach
        System.out.println(
            "Missing element in the array is " + missingNumberOptimal(nums)); // optimal approach
    }

    // Hashtable approach
    // Time: O(n) for the loop, and O(1) for the hash table operation `add(...)`
    // Space: O(n), the space/memory required to store the elements of an array into hash_table
    // where n is the length of the array.
    private static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length + 1;

        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // Math approach
    // Time: O(n), for the loop over n elements
    // Space: O(1), no extra memory allocated
    private static int missingNumberMathApproach(int[] nums) {
        int n = nums.length;
        int expectedSum = ((n * (n + 1)) / 2);

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // Optimal approach
    // Time: O(n), where n is the number of elements present in the array.
    // Space: O(1), no extra memory allocated
    private static int missingNumberOptimal(int[] nums) {
        int n = nums.length + 1;
        int res = 0;

        for (int i = 0; i < n; i++) {
            res ^= i;
        }

        for (int value : nums) {
            res ^= value;
        }
        return res;
    }

    // above solution can be further optimized to below
    private static int missingNumberOptimal01(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }
}
