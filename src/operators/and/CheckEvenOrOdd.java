package operators.and;

public class CheckEvenOrOdd {
  public static void main(String[] args) {
    int firstNumber = 125;
    int secondNumber = 8;
    System.out.println("Number '" + firstNumber + "' is : " + checkEvenOdd(firstNumber));
    System.out.println("Number '" + secondNumber + "' is : " + checkEvenOdd(secondNumber));
  }

  // Time: O(1) time
  // Space: O(1), no extra memory allocated
  private static String checkEvenOdd(int n) {
    return (n & 1) == 0 ? "Even" : "Odd";
  }
}
