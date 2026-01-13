package algorithms.slidingwindow;

public class MaximumSumSubArrayOfSizeK {
    /*
     * Problem Statement
     * Given an array of integers arr and an integer k, find the maximum sum of any contiguous subarray of length k.
     * Example
     * Input: arr = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
     * Subarrays of size 4: [1, 4, 2, 10], [4, 2, 10, 23], [2, 10, 23, 3], [10, 23, 3, 1], [23, 3, 1, 0], [3, 1, 0, 20]
     * Sums: 17, 39, 38, 37, 27, 24
     * Output: 39 (from [4, 2, 10, 23])
     */
    public static int maxSubArraySum(int[] nums, int k){
        int i=0,j=0,mx= Integer.MIN_VALUE,sum=0;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                mx = Math.max(sum,mx);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int result = maxSubArraySum(nums,4);
        System.out.println(result);
    }
}
