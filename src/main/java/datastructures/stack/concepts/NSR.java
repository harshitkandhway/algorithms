package datastructures.stack.concepts;

import java.util.Arrays;
import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        int[] input1 = {1, 3, 0, 0, 1, 2, 4};
        //Expected output : 0,0,-1,-1,-1,-1,-1
        int[] input = {1, 3, 0, 5, 1, 4, 3};
        //Expected output : 0,0,-1,1,-1,3,-1
        System.out.println("\nOptimised approach using stack with time complexity(O(n))");
        int[] result = nextSmallestToRight(input);
        Arrays.stream(result).forEach(System.out::print);
    }

    private static int[] nextSmallestToRight(int[] input) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,-1);

        for (int i = input.length-1; i >=0; i--) {
            while(!stack.empty() && stack.peek()>=input[i]){
                stack.pop();
            }
            if(!stack.empty()){
                result[i]=stack.peek();
            }
            stack.push(input[i]);
        }
        return result;
    }
}
