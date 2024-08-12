package datastructures.stack.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(t=='('||t=='{'||t=='[')
                stack.push(t);
            else {
                char temp = stack.pop();
                if(t==')' && temp!='(' || t=='}' && temp!='{' || t==']' && temp!='[')
                    return false;
            }
        }
        return stack.empty();
    }
}
