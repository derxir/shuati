package string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by justin on 6/23/17.
 * <p>
 * find all permutation A of all the characters in a String S of length N.
 * <p>
 * DP problem
 * <p>
 * eg 1234
 * 1-234
 * 2-34
 * 2-43
 * 3-24
 * 3-42
 * 4-23
 * 4-32
 * 2-134
 * 3-124
 * 4-123
 */
public class StringPermutation {


    private static void permutation(char[] str, int from, int to) {

        if (from == to) {
            System.out.println(str);
            return;
        }
        for (int i = from; i < to; i++) {
            str = swap(str, i , from);
            permutation(str, from + 1, to);
            str = swap(str, i , from);
        }

    }

    private static char[] swap(char[] str, int from, int to) {
        char tmp = str[from];
        str[from] = str[to];
        str[to] = tmp;
        return str;
    }

    public static void main(String[] args) {

        char[] str = "1234".toCharArray();
        int size = str.length;

        permutation(str, 0, size - 1);
    }

}
