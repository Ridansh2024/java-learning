// Day 5: LeetCode #20 - Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/

// Given a string containing just '(', ')', '{', '}', '[', ']'
// Determine if the input string is valid.
// Valid: Every open bracket has a matching close bracket in correct order.

// Examples:
// "()"     → true
// "()[]{}" → true
// "(]"     → false
// "([)]"   → false
// "{[]}"   → true

import java.util.*;

public class ValidParentheses {

    // Approach: Use Stack
    // When you see open bracket → push to stack
    // When you see close bracket → pop from stack and check if it matches
    // At end → stack should be empty

    public boolean isValid(String s) {
        // TODO: Solve using Stack
        // Step 1: Create a Stack<Character>
        // Step 2: Loop through each character
        //   - If '(' or '{' or '[' → push to stack
        //   - If ')' or '}' or ']' → check if stack is empty (false)
        //     then pop and check if it matches
        // Step 3: Return stack.isEmpty()

        return false;
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        System.out.println(solution.isValid("()"));       // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]"));       // false
        System.out.println(solution.isValid("([)]"));     // false
        System.out.println(solution.isValid("{[]}"));     // true
        System.out.println(solution.isValid("("));        // false
        System.out.println(solution.isValid(""));         // true
    }
}
