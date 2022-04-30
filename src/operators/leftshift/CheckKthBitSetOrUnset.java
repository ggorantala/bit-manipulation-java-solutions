package operators.leftshift;

public class CheckKthBitSetOrUnset {
  public static void main(String[] args) {
    System.out.println("First set-bit position for number: 18 is -> " + checkKthBitSet(18));
    System.out.println(
        "First set-bit position for number: 5 is -> " + checkKthBitSet01(5, 3)); // optimal approach
    System.out.println(
        "First set-bit position for number: 32 is -> "
            + checkKthBitSet01(10, 2)); // optimal approach
    System.out.println(
        "First set-bit position for number: 32 is -> "
            + checkKthBitSet01(10, 1)); // optimal approach
  }

  // Time: O(1)
  // Space: O(1)
  private static int checkKthBitSet(int n) {
    if (n == 0) {
      return 0;
    }

    int k = 1;

    while (true) {
      if ((n & (1 << (k - 1))) == 0) {
        k++;
      } else {
        return k;
      }
    }
  }

  // Time: O(1), always constant, as we are dealing with bit representation of decimals or ASCII.
  // They are represented in either 32/64
  // Space: O(1), no extra memory allocated
  private static boolean checkKthBitSet01(int n, int k) {
    return (n & (1 << (k - 1))) != 0;
  }
}
