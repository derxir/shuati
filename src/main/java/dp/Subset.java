package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justin on 7/9/18.
 *
 * given set of integers, return all subset with no duplicates.
 * for each int, consider two edges, with or without.
 * eventually it is a binary tree.
 * when reaching the leaf node, build the subset from the state of that node.
 *
 * notice that this solution uses extra space to store the ans rather than returning it from the function call.
 */
public class Subset{

    private static boolean[] flags;

    private static List<List<Integer>> ans = new ArrayList<>();

    private static void sub(int index, int[] nums){
        if (index > nums.length - 1){
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < flags.length; i++) {
                if (flags[i]){
                    arr.add(nums[i]);
                }
            }
            ans.add(arr);
            return;
        }
            flags[index] = true;
            sub(index + 1, nums);
            flags[index] = false;
            sub(index + 1, nums);
    }

    public static List<List<Integer>> solve(int[] nums){
        sub(0, nums);
        return ans;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        flags = new boolean[nums.length];
        solve(nums);
        System.out.println(ans);
    }
}
