package linear.string;

/**
 * Created by justin on 6/27/17.
 * <p>
 * DP. Denote S[i] sum of max sub array in A[i]
 * then, S[i+1] = max(S[i] + A[i+1], A[i+1]).
 * Time complexity O(n).
 */
public class MaxSubArraySum {

    static int findMaxSub(int[] array) {
        int result = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (sum > 0) {
                sum += array[i];
            } else {
                sum = array[i];
            }

            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }

}
