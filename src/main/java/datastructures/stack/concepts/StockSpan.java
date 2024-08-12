package datastructures.stack.concepts;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    //consecutive smaller or equal
    public static void main(String[] args) {
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        //Expected output : 1,1,1,2,1,4,6
        System.out.println("\nOptimised approach using stack with time complexity(O(n))");
        int[] result = stockSpan(input);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] stockSpan(int[] input) {
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,1);

        for (int i = 0; i < input.length; i++) {
            while(!stack.empty() && stack.peek().getKey()<=input[i]){
                stack.pop();
            }
            if(!stack.empty()){
                result[i]=i-stack.peek().getValue();
            }
            stack.push(new Pair<>(input[i],i));
        }
        return result;
    }
}
