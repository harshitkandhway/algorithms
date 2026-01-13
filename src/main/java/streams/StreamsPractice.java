package streams;

import java.util.Arrays;

public class StreamsPractice {

    //Chunks an array into smaller arrays of specified size.
    public static int[][] chunks(int[] num, int k){
        int[][] result = new int[num.length/k][k];
        int count=0;
        result[0][0]=num[0];
        for(int i=1;i<num.length;i++){
            result[count][i%k]=num[i];
            if(i%k==0)
                count++;
        }
        return result;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int[][] chunks = chunks(num, 3);
        print2DArray(chunks);
    }
}
