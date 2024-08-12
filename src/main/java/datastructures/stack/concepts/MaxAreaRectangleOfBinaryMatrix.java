package datastructures.stack.concepts;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaRectangleOfBinaryMatrix {
    /**
     Find the max area of a rectangle that can be drawn using the 1
     in the binary matrix:
     0   1   1   0
     1   1   1   1
     1   1   1   1
     1   1   0   0
     */
    public static void main(String[] args) {
        int[][] input = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(maxArea(input));
    }

    private static int maxArea(int[][] input) {
        int maxValue=-9999;
        int[] row = new int[input.length];
        Arrays.fill(row,0);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                row[j]=input[i][j]==0?0:input[i][j]+row[j];
            }
            int max = mah(row);
            if(max>maxValue)
                maxValue=max;
        }
        return maxValue;
    }

    private static int mah(int[] input){
        int mah=Integer.MIN_VALUE;
        int leftIndex[] = nsl(input);
        int rightIndex[] = nsr(input);
        for (int i = 0; i < input.length; i++) {
            int area = (rightIndex[i]-leftIndex[i]-1)*input[i];
            if(area>mah)
                mah=area;
        }
        return mah;
    }

    private static int[] nsl(int[] input){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,-1);

        for (int i = 0; i < input.length; i++) {
            while(!stack.empty() && input[i]<=stack.peek().getKey())
                stack.pop();
            if(!stack.empty())
                result[i]=stack.peek().getValue();
            stack.push(new Pair<>(input[i],i));
        }
        return result;
    }

    private static int[] nsr(int[] input){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] result = new int[input.length];
        Arrays.fill(result,input.length);

        for (int i = input.length-1; i >=0 ; i--) {
            while(!stack.empty() && input[i]<=stack.peek().getKey())
                stack.pop();
            if(!stack.empty())
                result[i]=stack.peek().getValue();
            stack.push(new Pair<>(input[i],i));
        }
        return result;
    }
}
