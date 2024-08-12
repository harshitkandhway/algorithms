package datastructures.stack.concepts;

import java.util.Arrays;
import java.util.Stack;

public class NGL {
    public static void main(String[] args) {
        int[] input = {1, 3, 0, 0, 1, 2, 4};
        //Expected output : -1,-1,3,3,3,3,-1
        System.out.println("\nOptimised approach using stack with time complexity(O(n))");
        int[] result = nextGreatestToLeft(input);
        Arrays.stream(result).forEach(System.out::print);
    }

    private static int[] nextGreatestToLeft(int[] input) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,-1);
        for (int i = 0; i < input.length; i++) {
            while(!stack.isEmpty() && stack.peek()<=input[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i]=stack.peek();
            }
            stack.push(input[i]);
        }
        return result;
    }
}
