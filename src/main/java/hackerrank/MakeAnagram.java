package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by justin on 6/25/18.
 */
public class MakeAnagram {


    static int makeAnagram(String a, String b) {
        int[] list = new int[128];
        for (char c : a.toCharArray()) {
            list[c] += 1;
        }
        for (char c : b.toCharArray()) {
            list[c] = list[c] - 1;
        }
        int res = 0;
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

