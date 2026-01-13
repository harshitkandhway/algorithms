package algorithms.recursion;

import java.util.List;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(2,5,1,4));
        stackSort(stack);
        stack.forEach(System.out::print);

    }

    private static void stackSort(Stack<Integer> stack) {
        if(stack.size()<=1)
            return;
        int temp = stack.pop();
        stackSort(stack);
        stackInsert(stack, temp);
    }

    private static void stackInsert(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        stackInsert(stack, temp);
        stack.push(val);
    }
}
