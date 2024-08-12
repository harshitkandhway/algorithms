package datastructures.stack.concepts;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] buildings = {3,0,0,2,0,4};
        int sum = rwt(buildings);
        System.out.println("Total water trapped = " + sum);
    }

    private static int rwt(int[] input) {
        int[] leftMax = new int[input.length];
        leftMax[0]=input[0];
        int[] rightMax = new int[input.length];
        rightMax[input.length-1] = input[input.length-1];
        for (int i = 1; i < input.length; i++) {
            leftMax[i]=Math.max(leftMax[i-1],input[i]);
        }
        for (int i = input.length-2; i >=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],input[i]);
        }
        int total =0;
        for (int i = 1; i < input.length-1; i++) {
            total+= (Math.min(leftMax[i], rightMax[i])-input[i]);
        }
        return total;
    }
}
