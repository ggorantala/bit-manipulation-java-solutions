package operators.rightshift;

public class CheckIfKthBitIsSetOrUnset {

    public static void main(String[] args) {
        System.out.println(
            "First set-bit position for number: 18 is -> " + checkIfKthSetOrUnset(18));
        System.out.println("First set-bit position for number: 5 is -> " + checkIfKthSetOrUnset(5));
        System.out.println(
            "First set-bit position for number: 32 is -> " + checkIfKthSetOrUnset(32));

        // optimal approaches
        System.out.println("n = 5, k = 3 : " + checkKthBitSet01(5, 3));
        System.out.println("------------");
        System.out.println("n = 10, k = 2 : " + checkKthBitSet01(10, 2));
        System.out.println("------------");
        System.out.println("n = 10, k = 1 : " + checkKthBitSet01(10, 1));
    }

    // Time: O(1)
    // Space: O(1)
    private static int checkIfKthSetOrUnset(int n) {
        if (n == 0) {
            return 0;
        }

        int k = 1;

        while (true) {
            if (((n >> (k - 1)) & 1) == 0) {
                k++;
            } else {
                return k;
            }
        }
    }

    // Time: O(1), always constant, as we are dealing with bit representation of decimals or ASCII.
    // They are represented in either 32/64
    // Space: O(1), no extra memory allocated
    public static boolean checkKthBitSet01(int n, int k) {
        // return (n & (1 << (k - 1))) != 0; this is using left shift
        return ((n >> (k - 1)) & 1) == 1;
    }
}
