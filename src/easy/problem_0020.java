package easy;

import java.util.Stack;

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
