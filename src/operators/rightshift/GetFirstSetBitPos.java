package operators.rightshift;

public class GetFirstSetBitPos {
  public static void main(String[] args) {
    System.out.println("First set-bit position for number: 18 is -> " + helper(18));
    System.out.println("First set-bit position for number: 5 is -> " + helper(5));
    System.out.println("First set-bit position for number: 32 is -> " + helper(32));
  }

  // Time: O(1), always constant, as we are dealing with bit representation of decimals or ASCII.
  // They are represented in either 32/64
  // Space: O(1), no extra memory allocated
  private static int helper(int n) {
    if (n == 0) return 0;

    int k = 1;

    while (true) {
      if (((n >> (k - 1)) & 1) == 0) {
        k++;
      } else {
        return k;
      }
    }
  }
}
