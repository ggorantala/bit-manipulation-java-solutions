public class CountDigits {

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Number of digits : " + countDigits(number)); // recommended approach
        System.out.println("Number of digits : " + logarithmicApproach(number));
        System.out.println("Number of digits : " + recursiveApproach(number));
        System.out.println("Number of digits : " + stringApproach(number));
    }

    // Optimal approach: Division
    // Time: O(n), run time depends on the number of digits in n. In the worst case, it iterates
    // through all the digits until it becomes 0.
    // Space: O(1), space complexity is O(1) since no additional space is allocated.
    private static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            ++count;
            n /= 10;
        }

        return count;
    }

    // logarithmic approach
    private static int logarithmicApproach(int n) {
        return n != 0 ? ((int) Math.floor(Math.log10(n) + 1)) : -1;
    }

    // recursive approach
    private static int recursiveApproach(int n) {
        // base checks
        if (n == 0) {
            return 0;
        }

        return (1 + recursiveApproach(n / 10));
    }

    // string conversion
    private static int stringApproach(int n) {
        // you can also use String.valueOf(number) to convert int to string.
        String num = Integer.toString(n);

        return num.length();
    }
}
