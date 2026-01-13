package datastructures.stack.hackerrank;

import java.util.Stack;

public class ReducedString {
    public static String superReducedString(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char top = !stack.isEmpty()?stack.peek():' ';
            char temp = s.charAt(i);
            if(temp==top)
                stack.pop();
            else
                stack.push(temp);
        }
        StringBuilder str = new StringBuilder();
        if(stack.isEmpty())
            str = new StringBuilder("Empty String");
        else{
            while(!stack.isEmpty()){
                str.insert(0, stack.pop());
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "aaabccddd";
        String reducedString = superReducedString(input);
        System.out.println("Reduced String: " + reducedString);
    }
}
