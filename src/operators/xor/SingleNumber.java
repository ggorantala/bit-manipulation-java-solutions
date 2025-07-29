package operators.xor;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 9, 1, 4, 2};
        System.out.println("Element appearing one time is " + singleNumber(nums));
        System.out.println("Element appearing one time is " + singleNumberMathApproach(nums));
        System.out.println(
            "Element appearing one time is " + singleNumberOptimal(nums)); // recommended approach
    }

    // Hashtable approach
    // Time: O(n) for the loop, and O(1) for the hash table operation `pop()`
    // Space: O(n), the space/memory required to store the elements of an array into hash_table
    // where n is the length of the array.
    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> lookup = new HashMap<>();

        for (int i : nums) {
            lookup.put(i, lookup.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (lookup.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }

    // Math approach
    // Time: O(n), where n is the number of elements present in the array.
    // Space: O(n), the space/memory required to store the elements of an array into hash_table
    private static int singleNumberMathApproach(int[] nums) {
        int sumOfUniqueElements = 0, totalSum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                sumOfUniqueElements += num;
            }
            totalSum += num;
        }
        return 2 * sumOfUniqueElements - totalSum;
    }

    // optimal approach
    // Time: O(n), where n is the number of elements present in the array
    // Space: O(1), no extra memory/space allocated.
    private static int singleNumberOptimal(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
