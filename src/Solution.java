import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(A));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> solve(List<Integer> A) {
        int i = 0;
        int j = A.size() - 1;

        while (i < j) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);

            i++;
            j--;
        }

        return (ArrayList<Integer>) A;
    }
}
