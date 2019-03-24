package problemsets.dp;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static problemsets.dp.StringPermutation.permutation;

/**
 * Created by justin on 6/27/17.
 */
public class DP {

    @Test
    public void testFibMemoization(){
        int n = 10;
        double[] cache = new double[n];
        cache[0] = 1;
        cache[1] = 2;
        assertEquals(144d, Fib.fib(n, cache), 0.001);
    }

    @Test
    public void stringPermutationTest() {
        char[] str = "1234".toCharArray();
        int size = str.length;

        permutation(str, 0, size - 1);
    }

    @Test
    public void testBalloon(){
        int[] arr = new int[]{1,4,1,9,1};
        assertEquals(13, MaxBalloonSum.dp_solution(arr));
    }


    @Test
    public void testSumTarget(){
        int[] arr = new int[]{3,34,4,14,5,2};
         assertTrue(!SumToTarget.rec_solution(arr, 13));
         assertTrue(SumToTarget.rec_solution(arr, 12));
         assertTrue(!SumToTarget.dp_solution(arr, 13));
         assertTrue(SumToTarget.dp_solution(arr, 12));

    }
}