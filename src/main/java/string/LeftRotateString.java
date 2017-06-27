package string;

/**
 * Created by justin on 6/21/17.
 * <p>
 * <p>
 * Problem: Given a String S of length N, int k, left rotate S so that the new String starts with S[k] and ends with S[k - 1].
 * Constraints: time complexity O(N), space complexity O(1).
 */
class LeftRotateString {

    private static void reverse(char[] array, int from, int to) {
        while (from < to) {
            char temp = array[from];
            array[from++] = array[to];
            array[to--] = temp;
        }
    }

    static void leftRotate(char[] s, int k) {
        int n = s.length;
        k %= n;

        reverse(s, 0, k - 1);
        reverse(s, k, n - 1);
        reverse(s, 0, n - 1);
    }


}
