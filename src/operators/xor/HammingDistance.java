package operators.xor;

public class HammingDistance {

    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        System.out.println("Hamming Distance between two integers is " + hammingDistance(a, b));
        System.out.println(
            "Hamming Distance between two integers is " + hammingDistanceOptimal(a,
                b)); // recommended
    }

    public static int hammingDistance(int a, int b) {
        int xor = a ^ b;
        int distance = 0;

        while (xor != 0) {
            if (xor % 2 == 1) {
                distance += 1;
            }
            xor >>= 1;
        }

        return distance;
    }

    // recommended solution
    // Time: O(1), the input size of the integer is fixed, constant time complexity
    // Space: O(1), no extra memory allocated
    public static int hammingDistanceOptimal(int a, int b) {
        int xor = a ^ b;
        int distance = 0;

        while (xor != 0) {
            distance += 1;
            xor &= (xor - 1); // equals to `xor = xor & ( xor - 1);`
        }

        return distance;
    }
}
