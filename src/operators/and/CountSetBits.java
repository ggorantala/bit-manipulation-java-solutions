package operators.and;

public class CountSetBits {
  public static void main(String[] args) {
    int number = 125;
    System.out.println("SetBit Count is : " + countSetBits(number));
    System.out.println("SetBit Count is : " + countSetBits01(number));
    System.out.println("SetBit Count is : " + countSetBits02(number));
    System.out.println(
        "SetBit Count is : " + brainKernighansAlgorithm(number)); // optimal approach (recommended)
    System.out.println(
        "SetBit Count is : " + lookupTableApproach(number)); // optimal approach (recommended)
  }

  // Time: O(n), where n is the number of bits present in the data type, for int has 32bits, and
  // long has 64bits
  // Space: O(1), no extra memory allocated
  private static int countSetBits(int n) {
    int ans = 0;
    while (n > 0) {
      if (n % 2 != 0) {
        ans++;
      }
      n /= 2;
    }

    return ans;
  }

  // above solution can be further simplified into
  // Time: O(n), where n is the number of bits present in the data type, for int has 32bits, and
  // long has 64bits
  // Space: O(1), no extra memory allocated
  private static int countSetBits01(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        count++;
      }
      n >>= 1;
    }
    return count;
  }

  // Above solutions can be further simplified into
  // Time: O(n), where n is the number of bits present in the data type, for int has 32bits, and
  // long has 64bits
  // Space: O(1), no extra memory allocated
  private static int countSetBits02(int n) {
    int count = 0;
    while (n > 0) {
      count += (n & 1);
      n >>= 1;
    }
    return count;
  }

  // Brian Kernighan’s algorithm (optimal and recommended approach)
  // Time: O(set-bit count)/ O(1), where setbit means number of `1` bits present in the given number
  // In the worst case, all 32bits can be `1` bits, so O(32) or O(64) time
  // Space: O(1), no extra memory allocated
  private static int brainKernighansAlgorithm(int n) {
    int count = 0;
    while (n > 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }

  // Lookup table approach (optimal approach, recommended)
  // Time: O(1), This requires an O(1) time solution to count the set bits in each of the 8-bit chunks.
  // Space: O(1), no extra memory allocated
  private static int lookupTableApproach(int n) {
    int[] table = new int[256];
    table[0] = 0;

    for (int i = 1; i < 256; i++) {
      table[i] = (i & 1) + table[i >> 1]; // i >> 1 equals to i/2
    }

    int res = 0;
    for (int i = 0; i < 4; i++) {
      res += table[n & 0xff];
      n >>= 8;
    }

    return res;
  }
}
