package operators.not;

public class SwitchSign {
  public static void main(String[] args) {
    int number = 8;
    System.out.println(switchSign(number));
  }

  // Time: O(1), We are not running a loop or scaling the inputs. The inputs never change. So the
  // operation takes a single unit of time, which is O(1)
  // Space: O(1), no extra memory allocated
  private static int switchSign(int number) {
    return ~number + 1;
  }
}
