// Day 1: LeetCode #1 - Two Sum
// https://leetcode.com/problems/two-sum/

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // TODO: Solve using HashMap approach
        // Hint: For each number, check if (target - number) exists in map
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        // Expected: [0, 1]
    }
}
