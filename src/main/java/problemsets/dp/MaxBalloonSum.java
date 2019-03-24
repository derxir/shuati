package problemsets.dp;

import static java.lang.Integer.max;

/**
 * Given an integer array of size N, and picking strategies which states that you can't
 * pick adjacent elements. Find the maximum value among all legal picks.
 *
 * [ 1,4,1,9,1]
 * sol = 13
 *
 * transition function: opt(i) = max(opt(i-1), opt(i-2) + arr(i))
 * terminal condition: opt(0) = arr(o), opt(1) = max(arr[0], arr[1])
 *
 */
class MaxBalloonSum {

    static int dp_solution(int[] arr){
        //use array to save states. why? because the problem only has one dimension
        int[] opt = new int[arr.length];
        opt[0] = arr[0];
        opt[1] = max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            opt[i] = max(opt[i - 1], opt[i - 2] + arr[i]);
        }
        return opt[arr.length -1];
    }
}
