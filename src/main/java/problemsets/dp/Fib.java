package problemsets.dp;

/**
 * Created by justin on 6/21/18.
 */
class Fib {

    static double fib(int n, double[] cache) {
/**
 *  Memoization
 */
        if (n == 0) return cache[0];
        if (n == 1) return cache[1];
        cache[n - 1] = cache[n - 1] == 0 ? fib(n - 1, cache) : cache[n - 1];
        cache[n - 2] = cache[n - 2] == 0 ? fib(n - 2, cache) : cache[n - 2];
        return cache[n - 1] + cache[n - 2];
    }
}
