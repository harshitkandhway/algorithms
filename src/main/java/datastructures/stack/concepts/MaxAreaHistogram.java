package datastructures.stack.concepts;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int[] input = {6,2,5,4,5,1,6};
        //Expected output : 12
        //System.out.println("\nOptimised approach using stack with time complexity(O(n))");
        mah(input);

    }

    private static void mah(int[] input) {
        int max=Integer.MIN_VALUE;
        int[] leftArr = nsl(input);
        int[] rightArr = nsr(input);
        for (int i = 0; i < leftArr.length; i++) {
            int calculated = (rightArr[i]-leftArr[i]-1)*input[i];
            if(max<calculated)
                max=calculated;
        }
        System.out.println(max);
    }

    //nearest smallest to left
    private static int[] nsl(int[] input) {
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,-1);

        for (int i = 0; i < input.length; i++) {
            while(!stack.empty() && stack.peek().getKey()>=input[i])
                stack.pop();
            if(!stack.empty())
                result[i] = stack.peek().getValue();
            stack.push(new Pair<>(input[i],i));
        }
        return result;
    }

    private static int[] nsr(int[] input) {
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,input.length);

        for (int i = input.length-1; i >=0; i--) {
            while(!stack.empty() && stack.peek().getKey()>=input[i])
                stack.pop();
            if(!stack.empty())
                result[i] = stack.peek().getValue();
            stack.push(new Pair<>(input[i],i));
        }
        return result;
    }
}
