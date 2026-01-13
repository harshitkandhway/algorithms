package algorithms;

import java.util.HashMap;

/*
arr = {4,9,5,17,7,8,1,2}
arr2 = {7,2,6,-6,4,3,10,9};
map =index{0,1---->10}->0;
map[4]=1 && map[sum-4]=1;
ifor(i-0 ; i<11 i++){
if(arr[]i && 11-arr[i])
}
    map{key -> sum-key}
    map{4->7
        9->2
        5->6
        17->-6
        7->4    count=1;
        8->3
        1->10
        2->9}   count=2;

     for(int i : map.values()){
     if(i){


     }



 */
public class AirtelInterviewQuestion {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Rohan");
        map.put(2,"Microsoft");
        map.put(3,"John");
        System.out.println("values : "+map.values());
        System.out.println("--------------");
        System.out.println("keyset : "+map.keySet());
        System.out.println("--------------");
        System.out.println("entryset : "+map.entrySet());
        System.out.println("--------------");

        int count = getCount(new int[]{4, 9, 5, 17, 7, 8, 1, 2}, 11);
        //mapping ->0,1,2,3,4,5,6,7,8,9,10,11
                  //0,0,1,0,1,1,0,1,0,1,0, 0
        System.out.println("count = " + count);
    }

    //4, 9, 5, 17, 7, 8, 1, 2 , sum=11
    public static int getCount(int[] input,int sum){
        int[] mapping = new int[sum+1]; //mapping = {0,1[1],2[1],3,4[1],5[1],6,7[1],8[1],9[1],10,11}
        int count=0;
        for(int i=0;i<input.length;i++)//O(n)
        {
            if(input[i]<=sum) {
                mapping[input[i]] = 1;
                if (mapping[sum - input[i]] == 1) {
                    count++;//2
                }
            }
        }
        return count;
    }
}
