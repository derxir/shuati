package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by justin on 6/14/18.
 * Input: [2,5], [[3,0,5],[1,2,10]], [3,2]
 * Output: 14
 * Explanation:
 * There are two kinds of items, A and B. Their prices are $2 and $5 respectively.
 * In special offer 1, you can pay $5 for 3A and 0B
 * In special offer 2, you can pay $10 for 1A and 2B.
 * You need to buy 3A and 2B, so you may pay $10 for 1A and 2B (special offer #2), and $4 for 2A.
 */
public class Solution638 {
    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(2,5);
        List<List<Integer>> special = Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10));
        List<Integer> needs = Arrays.asList(3, 2);
        System.out.println(shoppingOffers(price,special,needs));
    }

    public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(price, special, needs, 0);


    }

    private static int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int index) {
        // running out of offers
        if (index == special.size()) {
            return withOriginalPrice(price, needs);
        }

        List<Integer> s = special.get(index);
        // branch out for backtracking
        List<Integer> clone = new ArrayList<>(needs);
        int i;
        for (i = 0; i < s.size() - 1; i++) {
            int remain = clone.get(i) - s.get(i);
            if (remain < 0) {
                break;
            } else {
                clone.set(i, remain);
            }
        }
        index++;
        return Math.min(s.get(i) + helper(price, special, clone, index ), helper(price, special, needs, index));

    }

    private static int withOriginalPrice(List<Integer> price, List<Integer> needs) {
        int res = 0;
        for (int i = 0; i < price.size(); i++) {
            res = res + price.get(i) * needs.get(i);
        }
        return res;
    }
}
