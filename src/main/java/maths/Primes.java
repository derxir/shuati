package java.maths;

import java.util.LinkedList;

/**
 * Created by jyue on 4/18/2018.
 */
public class Primes {

    /**
     * find the N th prime number
     *
     * @param n
     * @return
     */
    public static int NthPrime(int n) {
        int candidate, count;
        LinkedList<Integer> res = new LinkedList<>();
        for (candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                res.add(candidate);
                count++;
            }
        }
        return res.get(n - 1);
    }

    /**
     * check if Integer n is a prime number
     *
     * @param n
     * @return boolean flag
     */
    private static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NthPrime(4));
    }
}
