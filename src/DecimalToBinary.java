import java.util.Arrays;
import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Number of bits : " + bitShifting(number));
        System.out.println("Number of bits : " + bitShiftingOptimal(number));
        System.out.println("Number of bits : " + decimalToBinaryUsingStack(number));
    }

    // bit shifting approach
    private static int bitShifting(int n) {
        int count = 0;
        while (n > 0) {
            ++count;
            n >>= 1; // this is equivalent to (n = n >> 1) OR (n = n/2);
        }
        return count;
    }

    // optimal solution - bit shifting
    private static int bitShiftingOptimal(int n) {
        int bitsCounter = 0;

        while ((1 << bitsCounter) <= n) {
            bitsCounter += 1;
        }

        return bitsCounter;
    }

    // using Stack approach
    private static String decimalToBinaryUsingStack(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int remainder = n % 2; // remainder gives either 0 OR 1
            stack.push(remainder); // store the remainder value in stack
            n >>= 1; // this is equivalent to n = n/2;
        }

        // loggers
        Arrays.asList("while loop breaks only when \"number\" terminates to : " + n, "  ")
            .forEach(System.out::println);

        int[] bits = new int[stack.size()];
        int k = 0;

        while (!stack.isEmpty()) {
            // each bit is popped and stored in array of integers
            bits[k++] = stack.pop();
        }

        return Arrays.toString(bits);
    }
}
