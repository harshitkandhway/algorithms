package algorithms.slidingwindow;

import java.util.Arrays;

public class FirstNegativeNumberInEveryWindowOfSizeK {

    public static void main(String[] args) {
        int[] nums = {12, -1, -7, 8, -15, 30, 18, 28};
        //int[] result = firstNegInAllSubArrayOfWindowK(nums,3);
        int[] result = bruteForceFirstNegInAllSubArrayOfWindowK(nums,3);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] firstNegInAllSubArrayOfWindowK(int[] nums, int k) {
        int i= nums.length-1;
        int j=nums.length-1,negIndex=0,negValue=0;
        int[] result = new int[nums.length-k+1];
        while(j>=0){
            if(nums[j]<0){
                negIndex=j;
                negValue=nums[j];
            }
            if (i-j+1==k) {
                result[i-k+1]=negValue;
                if(i==negIndex)
                    negValue=0;
                i--;
            }
            j--;
        }
        return result;
    }

    private static int[] bruteForceFirstNegInAllSubArrayOfWindowK(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            for(int j=i;j<i+k;j++){
                if(nums[j]<0){
                    result[i]=nums[j];
                    break;
                }
            }
        }
        return result;
    }
}
