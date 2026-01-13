package algorithms.recursion;

import java.util.List;
import java.util.Stack;

public class DeleteKthElementInStack {
    public static void main(String[] args) {
        int k=3;
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(1,3,2,5,4));
        //deleteK(stack, k);
        stack.forEach(System.out::print);
    }

//    private static void deleteK(Stack<Integer> stack, int k) {
//        if(k==3){
//            stack.pop();
//            return;
//        }
//       int temp = stack.pop();
//        deleteK(stack,k-);
//
//    }
}
