package operators.xor;

public class SwapTwoNumbers {
  public static void main(String[] args) {
    int a = 10, b = 121;
    swapSigns(a, b);
  }

  private static void swapSigns(int a, int b) {
    a = a ^ b;
    b = b ^ a;
    a = a ^ b;

    System.out.println("Finally, after swapping; a = " + a + " , b = " + b);
  }
}
