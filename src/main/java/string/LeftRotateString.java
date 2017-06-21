package string;

/**
 * Created by justin on 6/21/17.
 * <p>
 * <p>
 * Problem: Given a String S of length N, int k, left rotate S so that the new String starts with S[k] and ends with S[k - 1].
 * Constraints: time complexity O(N), space complexity O(1).
 */
public class LeftRotateString {


    private static void reverse(char[] array, int from, int to) {
        while (from < to) {
            char temp = array[from];
            array[from++] = array[to];
            array[to--] = temp;
        }

    }

    private static void leftRotate(char[] s, int k) {
        int n = s.length;

        reverse(s, 0, k - 1);
        reverse(s, k, n - 1);
        reverse(s, 0, n - 1);
    }

    public static void main(String[] args) {
        char[] s = "ABCDEFG".toCharArray();
        System.out.println(s);

        leftRotate(s, 3);

        System.out.println(s);
    }

}
