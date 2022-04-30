package operators.and;

import java.util.Arrays;

public class CountingBitsII {
  public static void main(String[] args) {
    int number = 6;
    System.out.println("Result " + Arrays.toString(countingBits(number)));
  }

  // Time: O(n+1)*O(setbit count) or O(n+1)*O(1), The time taken is proportional to set bits in
  // binary representation and the outer loop which runs (n+1) times.
  // Space: O(1), no extra memory allocated
  private static int[] countingBits(int n) {
    int[] ans = new int[n + 1];

    for (int i = 0; i <= n; i++) {
      ans[i] = helper(i);
    }

    return ans;
  }

  private static int helper(int n) {
    int count = 0;
    while (n > 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }
}
