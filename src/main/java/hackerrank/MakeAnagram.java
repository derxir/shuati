package hackerrank;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by justin on 6/25/18.
 * for anagram comparing, use new int[128] as counter.
 */
public class MakeAnagram {


    static int makeAnagram(String a, String b) {
        int[] list = new int[26];
        int res = 0;
        for (char c : a.toCharArray()) {++list[c - 'a'];}
        for (char c : b.toCharArray()) {--list[c - 'a'];}
        for (int i : list) res += Math.abs(i);
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = "abc";
        String b = "abc";

        System.out.println(makeAnagram(a, b));

    }
}

