package operators.and;

import java.util.Arrays;

public class CheckEvenOrOdd {

    public static void main(String[] args) {
        int firstNumber = 125;
        int secondNumber = 8;
        System.out.println("Number '" + firstNumber + "' is : " + checkEvenOdd(firstNumber));
        System.out.println("Number '" + secondNumber + "' is : " + checkEvenOdd(secondNumber));

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(checkEvenOdd(nums)));
    }

    // Time: O(1) time
    // Space: O(1), no extra memory allocated
    private static String checkEvenOdd(int n) {
        return (n & 1) == 0 ? "Even" : "Odd";
    }

    private static String[] checkEvenOdd(int[] nums) {
        String[] ans = new String[nums.length];

        int k = 0;
        for (int n : nums) {
            ans[k++] = ((n & 1) == 1) ? "Odd" : "Even";
        }
        return ans;
    }
}
