package problemsets.dp;

/**
 * Given
 * arr = [4,1,5,7,23,6]
 * S = 11
 * Return true if sum of any numbers in arr equals S
 */
public class SumToTarget {
    /**
     * State transition function: subset(arr, S, i) = subset(arr, S, i-1) or subset(arr, S-arr[i], i-1)
     * Exit condition:
     * S = 0 return true
     * when i=0, S = arr[0] return true
     * when arr[i]>S  return subset(arr, i-1, S)
     */

    static boolean rec_solution(int[] arr, int S) {
        return helper(arr, arr.length - 1, S);
    }

    private static boolean helper(int[] arr, int i, int S) {
        if (S == 0)
            return true;  // found already
        else if (i == 0)
            return S == arr[0];  // found when it reaches the last in arr
        else if (S < arr[i])
            return helper(arr, i - 1, S);
        return helper(arr, i - 1, S - arr[i]) || helper(arr, i - 1, S);
    }


    static boolean dp_solution(int[] arr, int S) {
        //use double-array to save states. why? because the problem has two dimensions
        boolean[][] subset = new boolean[arr.length][S + 1];

        // exit
        for (int i = 0; i < subset.length; i++) {
            subset[i][0] = true;
        }
        subset[0][arr[0]] = true;

        for (int r = 1; r < subset.length; r++) {
            for (int c = 1; c < subset[0].length; c++) {
                if (arr[r] > S) {
                    subset[r][c] = subset[r - 1][c];
                } else {
                    subset[r][c] = subset[r - 1][c] || subset[r - 1][c - arr[r] < 0 ? 0 : c - arr[r]];
                }
            }
        }
        return subset[arr.length - 1][S];
    }
}
