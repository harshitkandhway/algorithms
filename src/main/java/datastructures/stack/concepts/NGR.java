package datastructures.stack.concepts;

import java.util.Arrays;
import java.util.Stack;

/*
NGR (Next greatest to right or next largest element)
Example :
Given an array of numbers : 1, 3, 0, 0, 1, 2, 4
the next greatest element to =>
- 1 is 3
- 3 is 4
- 0 is 1
- 0 is 1
- 1 is 2
- 2 is 4
- 4 is -1 (Depending on the question if there is no greater element present we can use -1)
Hence our required output is 3, 4, 1, 1, 2, 4, -1 for the above input array.
 */
public class NGR {
    public static void main(String[] args) {
        int[] input = {1, 3, 0, 0, 1, 2, 4};
        System.out.println("\nbrute force approach with time complexity(O(n2))");
        brute_force_method(input);
        System.out.println("\nOptimised approach using stack with time complexity(O(n))");
        optimised_method_using_stack(input);
    }

    /*
    We can observe that the brute force method takes order of n2 time complexity while running and point to be noted
    is that the second loop of j depends on the first loop of i.

    Hence, this can be optimized by using the data structure stack.
     */
    private static void brute_force_method(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int ngr = -1;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > input[i]) {
                    ngr = input[j];
                    break;
                }
            }
            System.out.print(ngr);
        }
    }

    public static void optimised_method_using_stack(int[] input) {
        //1,3,0,0,1,2,4
        //3,4,1,1,2,4,-1
        int[] result = new int[input.length];
        Stack<Integer> temp = new Stack<>();
        temp.add(input[input.length - 1]);
        result[input.length - 1] = -1;
        int i = input.length - 2;
        while (i >= 0) {
            int top = temp.peek();
            if (input[i] < top) {
                result[i] = top;
                temp.add(input[i]);
                i--;
            } else {
                while (temp.peek() <= input[i]) {
                    temp.pop();
                }
            }
        }
        Arrays.stream(result).forEach(System.out::print);
    }

    public static int[] optimisedMethodUsingStack(int[] input) {
        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();

        // Initialize all elements in result as -1
        Arrays.fill(result, -1);

        for (int i = input.length - 1; i >= 0; i--) {
            // Clear the stack of all elements less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }
            // If the stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            // Push the current element onto the stack
            stack.push(input[i]);
        }

        return result;
    }
}
