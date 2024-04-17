package assignment5;

import java.util.*;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {
        
        Stack<Character> stack = new Stack<>();

        
        for (char ch : str.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else if (ch == ')' || ch == '}' || ch == ']') {
               
                if (stack.isEmpty()) {
                    return false;
                }
                                char top = stack.pop();
                
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{{[[(())]]}}";

        System.out.println("Is \"" + str1 + "\" balanced? " + isBalanced(str1));
        System.out.println("Is \"" + str2 + "\" balanced? " + isBalanced(str2));
        System.out.println("Is \"" + str3 + "\" balanced? " + isBalanced(str3));
    }
}

