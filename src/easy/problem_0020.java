package easy;

import java.util.Stack;

/**
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the same type.
 */
public class problem_0020 {

    public boolean isValid(String s) {
        Stack<Character> scopes = new Stack<>();
        for (char scope : s.toCharArray()) {
            if (scope == '(' || scope == '{' || scope == '[') {
                scopes.push(scope);
            }
            else if (scope == ')' && !scopes.isEmpty() && scopes.peek() == '(') {
                scopes.pop();
            }
            else if (scope == '}' && !scopes.isEmpty() && scopes.peek() == '{') {
                scopes.pop();
            }
            else if (scope == ']' && !scopes.isEmpty() && scopes.peek() == '[') {
                scopes.pop();
            }
            else {
                return false;
            }
        }
        return scopes.isEmpty();
    }
}
