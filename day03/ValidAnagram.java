// Day 3: LeetCode #242 - Valid Anagram
// https://leetcode.com/problems/valid-anagram/

// Given two strings s and t, return true if t is an anagram of s.
// An anagram uses the same letters, same count, different arrangement.
// Example: "anagram" and "nagaram" → true
// Example: "rat" and "car" → false

import java.util.HashMap;

public class ValidAnagram {

    // Approach 1: Using HashMap (count characters)
    public boolean isAnagram(String s, String t) {
        // TODO: Solve using HashMap
        // Step 1: If lengths are different → return false
        // Step 2: Count each character in 's' → put in map
        // Step 3: For each character in 't' → decrease count in map
        // Step 4: If any count goes below 0 → return false

        return false;
    }

    // Approach 2 (Bonus): Using int array (faster for only lowercase letters)
    public boolean isAnagramArray(String s, String t) {
        // TODO: Solve using int[26] array
        // Hint: int[] count = new int[26];
        //       count[ch - 'a']++ for s
        //       count[ch - 'a']-- for t
        //       check all counts are 0

        return false;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        System.out.println(solution.isAnagram("anagram", "nagaram")); // Expected: true
        System.out.println(solution.isAnagram("rat", "car"));         // Expected: false
        System.out.println(solution.isAnagram("listen", "silent"));   // Expected: true
        System.out.println(solution.isAnagram("hello", "world"));     // Expected: false
    }
}
