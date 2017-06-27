package string;

import org.junit.Test;

import static string.StringPermutation.permutation;

/**
 * Created by justin on 6/27/17.
 */
public class StringPermutationTest {

    @Test
    public void main() throws Exception {
        char[] str = "1234".toCharArray();
        int size = str.length;

        permutation(str, 0, size - 1);
    }

}