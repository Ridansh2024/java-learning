// Day 2: LeetCode #217 - Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

// Given an integer array nums, return true if any value appears
// at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // Duplicate found
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] test1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + solution.containsDuplicate(test1)); // Expected: true

        int[] test2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + solution.containsDuplicate(test2)); // Expected: false

        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3: " + solution.containsDuplicate(test3)); // Expected: true
    }
}
