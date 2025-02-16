package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "{()[()])(}";
        char inputArray[] = input.toCharArray();
        if (inputArray.length == 0) {
            System.out.println("Valid");
        }
        if (inputArray.length % 2 != 0) {
            System.out.println("not Vlaid");
            return;
        }
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < inputArray.length; i++) {
            char c = inputArray[i];
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stk.isEmpty()) {
                    System.out.println("Not Valid");
                    return;
                }
                char top = stk.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
                    System.out.println("Not Valid");
                    return;
                }
            }
        }
        if (stk.isEmpty()) {
            System.out.println("Valid Parenthesiis");
        }
    }
}
