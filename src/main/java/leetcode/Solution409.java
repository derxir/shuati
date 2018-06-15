package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by justin on 6/16/18.
 * can use char as int array index. it converts to ascii number.
 */
class Solution409 {
    public static int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        if (arr.length <= 1) {
            return arr.length;
        }
        Set<Character> set = new HashSet<>();
        int res = 0;
        for (char c : arr) {
            if (set.contains(c)) {
                set.remove(c);
                res++;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? 2 * res : 2 * res + 1;
    }

    static int longestPalindrome2(String s){
        int[] bit = new int[128];
        for(char c: s.toCharArray()){
            bit[c]++;
        }
        int res = 0;
        for ( int count : bit){
            res += count / 2 * 2;
            if( res % 2 == 0 && count % 2 == 1) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome2(s));
    }
}
