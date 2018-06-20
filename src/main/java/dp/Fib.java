package dp;

import java.util.Arrays;

/**
 * Created by justin on 6/21/18.
 */
public class Fib {

    private static double fib(int n, double[] cache) {
/**
 *  Memoization
 */
        System.out.println("....." + n);
        if (n == 0) return cache[0];
        if (n == 1) return cache[1];
        cache[n - 1] = cache[n - 1] == 0 ? fib(n - 1, cache) : cache[n - 1];
        cache[n - 2] = cache[n - 2] == 0 ? fib(n - 2, cache) : cache[n - 2];
        return cache[n - 1] + cache[n - 2];
    }

    public static void main(String args[]) {
        int n = 1000;
        double[] cache = new double[n];
        cache[0] = 1;
        cache[1] = 2;
        System.out.println(fib(n, cache));
        System.out.println(Arrays.toString(cache));
    }
}
