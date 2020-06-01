package dynamic_programing;

public class FibonacciSeries {
    public static int recursiveCounter =0;
    public static int dpCounter =0;
    public static int normalRecursion(int input) {
        recursiveCounter++;
        if (input > 1)
            return normalRecursion(input - 1) + normalRecursion(input - 2);
            return input;
    }

    public static void main(String[] args) {
        int result = normalRecursion(5);
        int result2 = dp(5);
        System.out.println("normal result = " + result +"\n dp result = "+result2);
        System.out.println("no of times loop executed = " + recursiveCounter);
        System.out.println("no of times loop executed(dp)= " + dpCounter);
    }

    public static int dp(int n){
        int[] result = new int[n+1];
        result[0]=0;
        result[1]=1;
        for (int i = 2; i <= n; i++) {
            dpCounter++;
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }

}
