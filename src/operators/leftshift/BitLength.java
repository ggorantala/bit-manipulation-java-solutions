package operators.leftshift;

public class BitLength {
  public static void main(String[] args) {
    System.out.println(bitsLength(8));
    System.out.println(bitsLength(2));
    System.out.println(bitsLength(7));
  }

  // Time: O(n), loop continues to run until it breaks
  // Space: O(1), no extra memory allocated
  private static int bitsLength(int number) {
    int bitsCounter = 0;

    while ((1 << bitsCounter) <= number) {
      bitsCounter += 1;
    }
    return bitsCounter;
  }
}
