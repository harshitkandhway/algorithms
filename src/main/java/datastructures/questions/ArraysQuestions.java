package datastructures.questions;

import java.util.stream.IntStream;

public class ArraysQuestions {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9};
        int n = 6;
        int k = 3;
        findMinMax2(arr,n,k);
    }
    public static void findMinMax(int[] arr, int n, int k){
        int minSum=0, maxSum=0;
        for(int i=0; i<n; i++){
            if(i>=k)
                maxSum+=arr[i];
            if(i<n-k)
                minSum+=arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }

    public static void findMinMax2(int[] arr, int n, int k) {
        int minSum = IntStream.range(0, n - k)
                .map(i -> arr[i])
                .sum();

        int maxSum = IntStream.range(k, n)
                .map(i -> arr[i])
                .sum();

        System.out.println(minSum + " " + maxSum);
    }
}
