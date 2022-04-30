package operators.leftshift;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(subsets(nums));
  }

  // Time: O(n * 2^n), the complexity is n times the power-set.
  // Space: O(2^n), storing `2^n` subset elements in an array. so the extra memory/space allocated
  // is directly proportional to the O(2^n).
  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    int powSize = (int) Math.pow(2, n);

    for (int i = 0; i < powSize; i++) {
      List<Integer> val = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) != 0) {
          val.add(nums[j]);
        }
      }
      result.add(val);
    }

    return result;
  }
}
