package operators.or;

public class NumberOfFlips {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println(
            "Min Flips required to make two numbers equal to third is : " + numberOfFlips(a, b, c));
        System.out.println(
            "Min Flips required to make two numbers equal to third is : "
                + numberOfFlipsSimplified(a, b, c));
    }

    private static int numberOfFlips(int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitC = ((c >> i) & 1);
            int bitA = ((a >> i) & 1);
            int bitB = ((b >> i) & 1);

            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    if (bitA == 1 && bitB == 1) {
                        ans += 2;
                    } else {
                        ans += 1;
                    }
                } else {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    // above snippet/algorithm can be further simplified into
    // Time: O(logn), as we are comparing bit values in each integer
    // Space: O(1), no extra memory allocated
    private static int numberOfFlipsSimplified(int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitC = ((c >> i) & 1);
            int bitA = ((a >> i) & 1);
            int bitB = ((b >> i) & 1);

            if ((bitA | bitB) != bitC) {
                ans += (bitC == 0) ? (bitA == 1 && bitB == 1) ? 2 : 1 : 1;
            }
        }
        return ans;
    }
}
