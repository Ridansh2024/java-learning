// Day 4: LeetCode #49 - Group Anagrams
// https://leetcode.com/problems/group-anagrams/

// Given an array of strings, group the anagrams together.
// Input: ["eat","tea","tan","ate","nat","bat"]
// Output: [["eat","tea","ate"],["tan","nat"],["bat"]]

import java.util.*;

public class GroupAnagrams {

    // Approach: Sort each word → use as key in HashMap
    // "eat" sorted = "aet"
    // "tea" sorted = "aet"  → same key! → same group!
    // "bat" sorted = "abt"  → different key → different group

    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Solve using HashMap<String, List<String>>
        // Step 1: Create HashMap — key = sorted word, value = list of anagrams
        // Step 2: For each word → sort it → use as key
        // Step 3: Add original word to the list for that key
        // Step 4: Return all values from map

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(input1));
        // Expected: [[eat, tea, ate], [tan, nat], [bat]]

        String[] input2 = {""};
        System.out.println(solution.groupAnagrams(input2));
        // Expected: [[""]]

        String[] input3 = {"a"};
        System.out.println(solution.groupAnagrams(input3));
        // Expected: [["a"]]
    }
}
