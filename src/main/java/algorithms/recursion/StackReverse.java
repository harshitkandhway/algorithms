package algorithms.recursion;

import java.util.List;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        int k=3;
        long x1= 2_1_0_4L;
        System.out.println(x1-2);
//        Stack<Integer> stack = new Stack<>();
//        stack.addAll(List.of(1,3,2,5,4));
//        stackReverse(stack);
//        stack.forEach(System.out::print);
    }

    private static void stackReverse(Stack<Integer> stack) {
        int temp = stack.pop();
        stackReverse(stack);
        
    }
}
