package operators.xor;

public class OppositeSigns {

    public static void main(String[] args) {
        int x = 100, y = -1;
        System.out.println("For inputs " + x + ", " + y + " : " + oppositeSigns(x, y));

        int z = 100, p = 501;
        System.out.println("For inputs " + z + ", " + p + " : " + oppositeSigns(z, p));
    }

    // Time: O(1), We are not running a loop or scaling the inputs. The inputs never change. So, the
    // operation takes a single unit of time, which is O(1)
    // Space: O(1), no extra memory allocated
    private static String oppositeSigns(int x, int y) {
        return (x ^ y) < 0 ? "Signs are opposite" : "Signs are not opposite";
    }
}
