import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 905. Sort Array By Parity
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1.  1 <= A.length <= 5000
 * 2.  0 <= A[i] <= 5000
 */

public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        Arrays.stream(A).forEach(i -> {
            if(i %2 == 0) evens.add(i);
            if(i %2 ==1)  odds.add(i);
        });
        evens.addAll(odds);

        return evens.stream().mapToInt(i->i).toArray();
    }
}