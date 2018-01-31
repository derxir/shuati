package linear.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static linear.string.MaxSubArraySum.findMaxSub;

/**
 * Created by justin on 6/27/17.
 */
public class MaxSubArraySumTest {

    @Test
    public void main() {

        int[] a1 = new int[]{1, 2, 3, 4, -4, -2, 1};
        assertEquals(10, findMaxSub(a1));

        int[] a2 = new int[]{1, 2, 3, -4, 4, 2, -1};
        assertEquals(8, findMaxSub(a2));

        int[] a3 = new int[]{-1, -2, -3, 4, 5, 6};
        assertEquals(15, findMaxSub(a3));


    }


}