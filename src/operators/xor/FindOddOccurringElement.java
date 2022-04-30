package operators.xor;

public class FindOddOccurringElement {
  public static void main(String[] args) {
    int result = helper(new int[] {4, 3, 3, 4, 4, 4, 5, 3, 5});
    System.out.println("Odd occurring element is " + result);
  }

  // Time: O(n), where n is the number of elements in the array.
  // Space: O(1), no extra memory allocated
  private static int helper(int[] arr) {
    int res = 0;
    for (int value : arr) {
      res ^= value;
    }
    return res;
  }
}
